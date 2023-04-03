//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
//La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
package ejercicio1.funciones;

import java.util.Scanner;


public class Ejercicio1Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int num1 ;
        int num2;
        System.out.println("Seleccione la operación que desea realizar");
        System.out.println("1=Sumar");
        System.out.println("2=Restar");
        System.out.println("3=Multiplicar");
        System.out.println("4=Dividir");
        System.out.println("5=Salir");
        int opcion =leer.nextInt(); 
           switch (opcion) {
             case 1:
                 System.out.println("ingrese dos numeros");
                 int s =sumar(leer.nextInt(),leer.nextInt());
                break;
             case 2:
                 System.out.println("ingrese dos numeros"); 
                 int r =restar(leer.nextInt(),leer.nextInt());
                 break;
             case 3:
                System.out.println("ingrese dos numeros"); 
                int m =multiplicar(leer.nextInt(),leer.nextInt());
                 break;
             case 4:
                System.out.println("ingrese dos numeros"); 
                int d =division(leer.nextInt(),leer.nextInt());
                break;
             default:
                 System.out.println("opcion no valida");
                   
             }     
    }
    public static int sumar(int num1,int num2) {
        int resultado = (num1+num2); 
        System.out.println("resultado= " + resultado);
        return resultado;
    }
        public static int restar(int num1,int num2) {
        int resultado = (num1-num2); 
        System.out.println("resultado= " + resultado);
        return resultado;
        }
        public static int multiplicar(int num1,int num2) {
        int resultado = (num1*num2); 
        System.out.println("resultado= " + resultado);
        return resultado;
        }
        public static int division(int num1,int num2) {
        int resultado = (num1/num2); 
        System.out.println("resultado= " + resultado);
        return resultado; }
}