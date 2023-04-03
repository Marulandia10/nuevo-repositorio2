
package ejercicio5guia3;
//Escriba un programa en el cual se ingrese un valor límite positivo, 
//y a continuación solicite números al usuario hasta que la suma de los números 
//introducidos supere el límite inicial.

import java.util.Scanner;


public class Ejercicio5GUIA3 {

  
    public static void main(String[] args) {
         System.out.println("Ingrese valor limite (positivo) : ");
        Scanner scan = new Scanner(System.in);
        int limite = scan.nextInt();
        int num = 0;
        while(num < limite){
            System.out.println("Ingrese numeros: ");
            num += scan.nextInt();
        }
        System.out.println("Salio");

    }


        
        
    }
    
