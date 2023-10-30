/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author Emir
 */

import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.println("Crear una nueva tarea en la lista de tareas:");
                System.out.print("Nombre de la tarea: ");
                String nombre = scanner.nextLine();
                System.out.print("Descripción de la tarea: ");
                String descripcion = scanner.nextLine();
                System.out.print("Fecha de vencimiento (dd/mm/yyyy): ");
                String fechaVencimiento = scanner.nextLine();
                
                // Crear un objeto de tarea
                Tarea2 tarea = new Tarea2(nombre, descripcion, fechaVencimiento);
                
                System.out.println("Tarea creada con éxito: " + tarea);
                
                // Preguntar al usuario si desea agregar otra tarea
                System.out.print("¿Desea agregar otra tarea? (si/no): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                }
            } catch (Exception e) {
                System.err.println("Error al ingresar datos. Por favor, inténtalo de nuevo.");
            }
        }
        
        System.out.println("Gracias por usar la aplicación de lista de tareas.");
    }
}

class Tarea2 {
    private String nombre;
    private String descripcion;
    private String fechaVencimiento;
    
    public Tarea2(String nombre, String descripcion, String fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public String toString() {
        return "Tarea: " + nombre + "\nDescripción: " + descripcion + "\nFecha de vencimiento: " + fechaVencimiento;
    }
}

