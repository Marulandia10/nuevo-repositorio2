
package ejercicioextra1guia3;

import java.util.Scanner;

public class EjercicioExtra1GUIA3 {

 //Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 //Por ejemplo, si el usuario ingresa 1600 minutos,
    //el sistema debe calcular su equivalente: 1 día, 2 horas.
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       
      double min;
      double day;
        System.out.println("Ingrese cantidad de minutos");
        min = leer.nextInt();
        
        day = min /1440;
        System.out.println(Math.round(day - day%1) );
        System.out.println(Math.round((day % 1)*24)-((day % 1)*24)%1); 
          
       // System.out.println(Math.round(day %1)*24) - (day%1);
      
                       
    }
    
}
