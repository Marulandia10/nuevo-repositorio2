/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer041703;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class EJER041703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
      System.out.println("Ingrese los grados celcius: ");
      int celcius = leer.nextInt();
      int farenheit = 32 + (9 * celcius / 5);
        System.out.println("Su equivalencia en farenheit es igual a: " + farenheit);
       
      
    }
    
}
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//La fórmula correspondiente es: F = 32 + (9 * C / 5).
