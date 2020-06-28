/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Faith
 */
public class Oracle {
    //instancia destino.cw9v0mt6g20g.us-east-1.rds.amazonaws.com
    //hr hr123
    private JTextField instancia, nombreBD, puerto, usuario, password;
    private JTextArea revision, resultados;
    private String cadenaConexion;
    private boolean isPrueba;
    private Connection connection;

    public Oracle(JTextField instancia, JTextField baseDeDatos, JTextField puerto, JTextField usuario, JTextField contrasenia, JTextArea bitacora, JTextArea consola) {
        this.instancia = instancia;
        this.nombreBD = baseDeDatos;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = contrasenia;
        this.revision = bitacora;
        this.resultados = consola;
    }
    
    private void crearCadenaConexion(){
        cadenaConexion = String.format("jdbc:oracle:thin:@//%s:%s/%s", instancia.getText(), puerto.getText(), nombreBD.getText());
    }
    
    public boolean estadoConexion() throws SQLException{
        if (connection.isClosed()) {
            return false;
        }else{
            return true;
        }
    }
    
    public void crearConexion(){
        try {
            crearCadenaConexion();
            connection = DriverManager.getConnection(cadenaConexion, usuario.getText(), password.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from mensaje");
            revision.append("\nConexion Exitosa a:");
            while(resultSet.next()){
                revision.append("\n" + resultSet.getString(1));
                revision.append("\n--------------------------------------------------------");
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
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
                revision.append("\nGuardando Bases de Datos de Destino");
                revision.append("\n--------------------------------------------------------");
            }
        }
        
    }
    
    public void cerrarConexion(){
        try {
            if (!connection.isClosed()) {
                connection.close();
                if (!isPrueba) {
                    revision.append("\nCerrando Conexion - Base de Datos Destino");
                    revision.append("\n--------------------------------------------------------");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            revision.append("ERROR: " + ex.getMessage() + ex.getCause().toString());
            revision.append("\n--------------------------------------------------------");
        }
    }
    
    public boolean generarCambios(String query){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            resultados.append("ERROR: " + ex.getMessage() + ex.getCause().toString());
            resultados.append("\n--------------------------------------------------------");
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                resultados.append("ERROR: " + ex.getMessage() + ex.getCause().toString());
                resultados.append("\n--------------------------------------------------------");
            }
            return false;
        }
        return true;
    }
    
    public boolean isIsPrueba() {
        return isPrueba;
    }
    
    public void setIsPrueba(boolean isPrueba) {
        this.isPrueba = isPrueba;
    }
}
