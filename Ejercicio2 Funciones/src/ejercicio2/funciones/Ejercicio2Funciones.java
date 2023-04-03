
import java.util.Scanner;

//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
//ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

public class Ejercicio2Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
     do {
         System.out.println("Ingrese su nombre");
         String nombre = leer.nextLine();
      
   
         System.out.println("Ingrese su edad");
         int edad = leer.nextInt();
         System.out.println("Su edad es: " + edad);
         System.out.println("Su nombre es: " + nombre);
         System.out.println("¿Quiere seguir ingresando personas?");
          String resp = leer.next();
         if (edad<18) {
             System.out.println("La persona ingresada es menor de edad");
         }else {
             System.out.println("La persona ingresada es mayor de edad ");
         }
         
     }while (resp.equalsIgnoreCase("si"));
     
     }
    }
    

