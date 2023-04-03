
package ejercicio4guia3;

import java.util.Scanner;

//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
//Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
//en caso contrario, 
//se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
public class Ejercicio4GUIA3 {

    public static void main(String[] args) {
       System.out.println("Ingrese una frase o palabra: ");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        //if(frase.substring(0,1).equals('A')){
       if("A".equalsIgnoreCase(frase.substring(0,1))){
            System.out.println("CORRECTO");
        }else System.out.println("INCORRECTO");






    }

}
