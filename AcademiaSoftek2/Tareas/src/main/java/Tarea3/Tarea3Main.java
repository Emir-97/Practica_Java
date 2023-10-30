/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3;

/**
 *
 * @author Emir
 */
public class Tarea3Main {
    
    public static void main(String[] args){
    
        Connection1 con = new Connection1();
        con.establecerConnection();
        con.insertarDatos();
        con.actualizarDatos();
        con.consultarDatos();
        con.eliminarDato();
    }
}
