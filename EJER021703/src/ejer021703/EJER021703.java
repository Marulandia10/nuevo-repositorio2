/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer021703;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class EJER021703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println(nombre);
        
    }
    
}
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
