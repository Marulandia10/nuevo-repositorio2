package practicaejer1clase2;
import java.util.Scanner;

public class PRACTICAEJER1CLASE2{

    /**
     * Escribir un programa que pida dos números enteros por teclado
     * y calcule la suma de los dos. 
     * El programa deberá después mostrar el resultado de la suma
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1;
        int num2;
        int resu;
        System.out.println("Ingrese un numero");
        num1=leer.nextInt();
        System.out.println("Ingrese un numero");
        num2=leer.nextInt();
        resu=num1+num2;
        System.out.println("Resultado= "+resu);
    }
    
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
