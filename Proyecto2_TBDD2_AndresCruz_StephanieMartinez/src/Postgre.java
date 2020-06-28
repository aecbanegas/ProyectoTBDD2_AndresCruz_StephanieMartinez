/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Postgre {
    private JTextField instancia, baseDeDatos, puerto, usuario, contrasenia;
    private JTextArea bitacora, consola;
    private String cadenaConexion;
    private boolean isPrueba;
    private Connection connection;
    private ArrayList<String> diferencias;
    private ArrayList<Tablas> tablas = new ArrayList<>();

    public Postgre(JTextField instancia, JTextField baseDeDatos, JTextField puerto, JTextField usuario, JTextField contrasenia, JTextArea bitacora, JTextArea consola) {
        this.instancia = instancia;
        this.baseDeDatos = baseDeDatos;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.bitacora = bitacora;
        this.consola = consola;
        this.connection = null;
    }
    
    private void crearCadenaConexion(){
        cadenaConexion = String.format("jdbc:postgresql://%s:%s/%s", instancia.getText(), puerto.getText(), baseDeDatos.getText());
    }
    
    public void crearConexion(){
        try {
            crearCadenaConexion();
            connection = DriverManager.getConnection(cadenaConexion, usuario.getText(), contrasenia.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select datname from pg_database where datname = 'origen'");
            resultSet.next();
            bitacora.append("\nConexion Exitosa a:");
            bitacora.append("\n" + resultSet.getString(1));
            bitacora.append("\n--------------------------------------------------------");
        }catch (SQLException ex) {
            if (ex.getCause() == null) {
                bitacora.append("\nERROR: " + ex.getMessage());
            }else{
                bitacora.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            bitacora.append("\n--------------------------------------------------------");
        }finally{
            if (isPrueba) {
                cerrarConexion();
                bitacora.append("\nPrueba Finalizada");
                bitacora.append("\n--------------------------------------------------------");
            }else{
                bitacora.append("\nGuardando Datos de Base de Datos de Origen");
                bitacora.append("\n--------------------------------------------------------");
            }
        }
        
    }
    
    public boolean estadoConexion() throws SQLException{
        if (connection.isClosed()) {
            return false;
        }else{
            return true;
        }
    }
    
    
    public void cerrarConexion(){
        try {
            if (connection != null) {
                if (!connection.isClosed()) {
                    connection.close();
                    if (!isPrueba) {
                        bitacora.append("\nCerrando Conexion");
                        bitacora.append("\n--------------------------------------------------------");
                    }
                }
            }
        } catch (SQLException ex) {
            if (ex.getCause() == null) {
                bitacora.append("\nERROR: " + ex.getMessage());
            }else{
                bitacora.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            bitacora.append("\n--------------------------------------------------------");
        }
    }
    
    public boolean obtenerDiferencias(String condiciones, String tabla){
        diferencias = new ArrayList<>();
        String query = "SELECT * FROM audit.bitacoraOrigen "+ obtenerCondicionTiempo(tabla) + condiciones;
        System.out.println("Query:" + query);
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            //Verificador de Sincornizacion
            if (resultSet.next()) {
                do {
                    switch(resultSet.getString("operacion")){
                        case "I":
                            consola.append("\nSe ha encontrado una Insercion en: " + resultSet.getString("tabla"));
                            consola.append("\n--------------------------------------------------------");
                            break;
                        case "D":
                            consola.append("\nSe ha encontrado una Eliminacion en: " + resultSet.getString("tabla"));
                            consola.append("\n--------------------------------------------------------");
                            break;
                        case "U":
                            consola.append("\nSe ha encontrado una Actualizacion en: " + resultSet.getString("tabla"));
                            consola.append("\n--------------------------------------------------------");
                            break;
                    }
                    String temp = resultSet.getString("sqlorigen");
                    temp = temp.replace(';', ' ');
                    diferencias.add(temp);
                } while (resultSet.next());
            } else {
                consola.append("\nLas Bases de Datos se sincronizaron en la tabla: " + tabla);
                consola.append("\n--------------------------------------------------------");
                return false;
            }
        } catch (SQLException ex) {
            if (ex.getCause() == null) {
                consola.append("\nERROR: " + ex.getMessage());
            }else{
                consola.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            consola.append("\n--------------------------------------------------------");
            return false;
        } 
        return true;
    }
    
    private String obtenerCondicionTiempo(String tabla){
        if (cargarTablas()) {
            String temp = getMarcaDeTimepo(tabla);
            if (temp != null) {
                return "WHERE fecha >= '" + temp + "' ";
            }else{
                return "";
            }
        }else{
            return "";
        }
        
    }
    
    public String getMarcaDeTimepo(String tabla){
        String timeStamp = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Tablas temp = getTabla(tabla);
        if (temp == null) {
            return null;
        }else{
            timeStamp = dateFormat.format(temp.getFecha());
        }
        return timeStamp;
    }
    
    public boolean cargarTablas(){
        boolean estado = true;
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        try {
            fis = new FileInputStream("./tablas.acsm");
            entrada = new ObjectInputStream(fis);
            while (true) {   
                tablas = (ArrayList<Tablas>) entrada.readObject();
            }
        } catch (FileNotFoundException e) {
            estado = false;
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return estado;
    }
    
    public void guardarTablas(){
        FileOutputStream archivo = null;
        ObjectOutputStream objeto = null;
        try {
            archivo = new FileOutputStream("./tablas.acsm");
            objeto = new ObjectOutputStream(archivo);
            
            objeto.writeObject(tablas);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
                if (objeto != null) {
                    objeto.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public ArrayList<String> getDiferencias() {
        return diferencias;
    }

    public void setRefDate(String tabla, Date Fecha) {
        Tablas temp = getTabla(tabla);
        if (temp == null) {
            tablas.add(new Tablas(tabla, Fecha));
        }else{
            temp.setFecha(Fecha);
        }
        
    }
        
    public boolean isIsPrueba() {
        return isPrueba;
    }
    
    public void setIsPrueba(boolean isPrueba) {
        this.isPrueba = isPrueba;
    }
    
    public Tablas getTabla(String tabla){
        for (Tablas refDate : tablas) {
            if (tabla.equals(refDate.getNombre())) {
                return refDate;
            }
        }
        return null;
    }

    public ArrayList<Tablas> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tablas> tablas) {
        this.tablas = tablas;
    }
    
    
}
