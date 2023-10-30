/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author Emir
 */
public class punto1 {
        
    public static void main(String[] args){
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, ingrese el primer número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, ingrese el segundo número"));
        double result = num1 + num2;
        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria entre "+num1+" y "+num2+" es igual a "+result);
                
    }
}
