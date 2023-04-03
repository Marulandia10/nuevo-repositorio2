//Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
//y los muestre por pantalla en orden descendente.
package ejercicio1.arreglos;


public class Ejercicio1ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     int vector[] = new int [100];
     
   
     //Scanner teclado = new Scanner (System.in);
     for (int i= 0; i<vector.length; i++)
     {
        vector[i] = i;
        System.out.println("En la posicion que estoy es:" + i);
     }
        System.out.println("======================================");
     System.out.println("Ahora el orden es descendente" );
     
     for (int i= vector.length-1; i>=0; i--)
     {
         System.out.println(" vector["+i+"]: " + vector[i] );
     }
    }
}

