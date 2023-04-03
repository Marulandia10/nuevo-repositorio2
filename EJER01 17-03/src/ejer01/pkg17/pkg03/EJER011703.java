/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer01.pkg17.pkg03;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class EJER011703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner leer = new Scanner (System.in); 
       System.out.println ("Ingrese el valor de los numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
       int suma = num1 + num2;
        
       System.out.println("El resultado de la suma es :" +  suma);
       
                
     
    }
    
}
