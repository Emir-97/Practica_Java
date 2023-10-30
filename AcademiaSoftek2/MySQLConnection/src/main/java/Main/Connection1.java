package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connection1 {

    Connection conectar = null;
    String user = "root";
    String password = "Emir/1997";
    String db = "sqltest";
    String ip = "127.0.0.1";
    String port = "3306";
    String cadena = "jdbc:mysql://"+ ip + "/" + db;
    Statement st = null;
    ResultSet rs = null;
    
    public Connection establecerConnection(){
            
        try{
//            Class.forName("com.mysql.jdbc.Driver"); 
             
            
            conectar = DriverManager.getConnection(cadena, user, password);
            JOptionPane.showMessageDialog(null, "Se conectó Correctamente");
            st = conectar.createStatement();
            rs = st.executeQuery("SELECT * FROM carreras");
            
            while(rs.next()){
                int id_carrera = rs.getInt(1);
                System.out.println("El ID de la carrera: " + id_carrera);
                
                String nombre_carrera = rs.getString(2);
                System.out.println("El nombre de la carrera es: " + nombre_carrera);
            }
           } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Surgió el siguiente error: "+ e);
           }
        return conectar;
    }    
    
    public void insertarDatos(){
        
        Connection con = establecerConnection();
        
        if(con != null){
            // Crear un stament object para ejecutar las consultas
            Statement statement;
            try {
                statement = con.createStatement();
                int id = Integer.parseInt(JOptionPane.showInputDialog("Please, Input an Intenger ID."));
                String nombre = JOptionPane.showInputDialog("Please, Input the carrer name");
                // Crear una consulta INSERT datos en la carrera TABLE
                String query = "INSERT INTO carreras(id, nombre_carrera) VALUES("+id+",'"+nombre+"')";
                // Ejecutamos la consulta INSERT
                statement.executeUpdate(query);
                System.out.println("Los datos fueron insertados correctamente");
                // Cerramos el Statement y la connection
                statement.close();
                con.close();
        } catch(Exception e){
            e.printStackTrace();
        }}
    }
    
    public void actualizarDatos(){
        // Establecer la connection
        Connection con = establecerConnection();
        
        if(con != null){
            try{
                // Creamos el Statement Object para ejecutar la consulta
                Statement statement = con.createStatement();
                
                // Creamos la consulta
                String query = "UPDATE carreras SET nombre_carrera='Física' WHERE id=2";
                
                // Ejecutamos la query
                statement.executeUpdate(query);
                
                // Imprimimos en pantalla
                System.out.println("Datos Actualizados Correctamente");
                
                // Cerramos el Statement
                statement.close();
                        
                con.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void consultarDatos(){
        
        // Establecer la connection
        Connection con = establecerConnection();
        
        if(con != null){
            try{
                // Creamos un Statement Object para hacer queries en SQL
                Statement statement = con.createStatement();
                
                // Ejecutar una consulta select para obtener los datos del table carreras
                ResultSet resultSet = statement.executeQuery("SELECT * FROM carreras");
                
                // Recorre los resultados de la consulta
                while(resultSet.next()){
                    // Obtiene valores de las columnas por nombre y por índice
                    int id = resultSet.getInt(1);
                    String nombre_carrera = resultSet.getString(2);
                    
                    // Imprimimos los valores por pantalla
                    System.out.println("ID "+ id + ", de la carrera de " + nombre_carrera);
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void eliminarDato(){
    
        Connection con = establecerConnection();
        
        if(con != null){
            try{
                Statement statement = con.createStatement();
                String query = "DELETE FROM carreras WHERE id="+3;
                statement.executeUpdate(query);
                System.out.println("Dato eliminado satisfactoriamente");
                statement.close();
                con.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
