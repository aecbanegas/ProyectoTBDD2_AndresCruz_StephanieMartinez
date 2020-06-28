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
    private JTextField instancia, nombreBD, puerto, usuario, password;
    private JTextArea revision, resultados;
    private String cadenaConexion;
    private boolean isPrueba;
    private Connection conexion;
    private ArrayList<String> diferencias;
    private ArrayList<Tablas> tablas = new ArrayList<>();

    public Postgre(JTextField instancia, JTextField baseDeDatos, JTextField puerto, JTextField usuario, JTextField contrasenia, JTextArea bitacora, JTextArea consola) {
        this.instancia = instancia;
        this.nombreBD = baseDeDatos;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = contrasenia;
        this.revision = bitacora;
        this.resultados = consola;
        this.conexion = null;
    }
    
    private void crearCadenaConexion(){
        cadenaConexion = String.format("jdbc:postgresql://%s:%s/%s", instancia.getText(), puerto.getText(), nombreBD.getText());
    }
    
    public void crearConexion(){
        try {
            crearCadenaConexion();
            conexion = DriverManager.getConnection(cadenaConexion, usuario.getText(), password.getText());
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("select datname from pg_database where datname = 'origen'");
            resultSet.next();
            revision.append("\nConexion Exitosa a:");
            revision.append("\n" + resultSet.getString(1));
            revision.append("\n--------------------------------------------------------");
        }catch (SQLException ex) {
            if (ex.getCause() == null) {
                revision.append("\nERROR: " + ex.getMessage());
            }else{
                revision.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            revision.append("\n--------------------------------------------------------");
        }finally{
            if (isPrueba) {
                cerrarConexion();
                revision.append("\nPrueba Finalizada");
                revision.append("\n--------------------------------------------------------");
            }else{
                revision.append("\nGuardando Datos de Base de Datos de Origen");
                revision.append("\n--------------------------------------------------------");
            }
        }
        
    }
    
    public boolean estadoConexion() throws SQLException{
        if (conexion.isClosed()) {
            return false;
        }else{
            return true;
        }
    }
    
    
    public void cerrarConexion(){
        try {
            if (conexion != null) {
                if (!conexion.isClosed()) {
                    conexion.close();
                    if (!isPrueba) {
                        revision.append("\nCerrando Conexion");
                        revision.append("\n--------------------------------------------------------");
                    }
                }
            }
        } catch (SQLException ex) {
            if (ex.getCause() == null) {
                revision.append("\nERROR: " + ex.getMessage());
            }else{
                revision.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            revision.append("\n--------------------------------------------------------");
        }
    }
    
    public boolean generadorQuery(String condiciones, String tabla){
        diferencias = new ArrayList<>();
        String query = "SELECT * FROM audit.bitacoraOrigen "+ obtenerCondicionTiempo(tabla) + condiciones;
        //System.out.println("Query:" + query);
        try {
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                do {
                    switch(resultSet.getString("operacion")){
                        case "I":
                            resultados.append("\nSe ha encontrado una Insercion en: " + resultSet.getString("Tabla"));
                            resultados.append("\n--------------------------------------------------------");
                            break;
                        case "D":
                            resultados.append("\nSe ha encontrado una Eliminacion en: " + resultSet.getString("Tabla"));
                            resultados.append("\n--------------------------------------------------------");
                            break;
                        case "U":
                            resultados.append("\nSe ha encontrado una Actualizacion en: " + resultSet.getString("Tabla"));
                            resultados.append("\n--------------------------------------------------------");
                            break;
                    }
                    String temp = resultSet.getString("sqlorigen");
                    temp = temp.replace(';', ' ');
                    diferencias.add(temp);
                } while (resultSet.next());
            } else {
                resultados.append("\nLas Bases de Datos ya estan sincronizados para la tabla: " + tabla);
                resultados.append("\n--------------------------------------------------------");
                return false;
            }
        } catch (SQLException ex) {
            if (ex.getCause() == null) {
                resultados.append("\nERROR: " + ex.getMessage());
            }else{
                resultados.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            resultados.append("\n--------------------------------------------------------");
            return false;
        } 
        return true;
    }
    
    private String obtenerCondicionTiempo(String tabla){
        if (cargarTablas()) {
            String temp = getFechaActualizacion(tabla);
            if (temp != null) {
                return "WHERE fecha >= '" + temp + "' ";
            }else{
                return "";
            }
        }else{
            return "";
        }
        
    }
    
    public String getFechaActualizacion(String tabla){
        String tiempo = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Tablas temp = getTabla(tabla);
        if (temp == null) {
            return null;
        }else{
            tiempo = dateFormat.format(temp.getFecha());
        }
        return tiempo;
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
            System.out.println("Final de Archivo");
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

    public void setFechaActualizacion(String tabla, Date Fecha) {
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
