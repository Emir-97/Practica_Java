package Main;
/*public class Main {
    
    public static void main(String[] args){
        Connection1 con = new Connection1();
        con.establecerConnection();
//        con.insertarDatos();
//        con.actualizarDatos();
//        con.consultarDatos();
//        con.eliminarDato();

//        Form form = new Form();
//        form.setVisible(true);
    }
}*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main {

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
//            st = conectar.createStatement();
//            rs = st.executeQuery("SELECT * FROM carreras");
            
//            while(rs.next()){
//                int id_carrera = rs.getInt(1);
//                System.out.println("El ID de la carrera: " + id_carrera);
//                
//                String nombre_carrera = rs.getString(2);
//                System.out.println("El nombre de la carrera es: " + nombre_carrera);
//            }
           } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Surgió el siguiente error: "+ e);
           }
        return conectar;
    }    
    
    public static void main(String[] args){
        Main app = new Main();
        app.establecerConnection();
    }
   
}

