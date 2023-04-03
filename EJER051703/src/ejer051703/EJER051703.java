/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer051703;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class EJER051703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int Num1 = leer.nextInt();
        System.out.println("El doble es: " + (Num1 * 2));
        System.out.println("El trible es: " + (Num1 * 3));
        System.out.println("La raiz cuadrada es: " + (Math.sqrt(Num1)));

    }

}
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
//el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
