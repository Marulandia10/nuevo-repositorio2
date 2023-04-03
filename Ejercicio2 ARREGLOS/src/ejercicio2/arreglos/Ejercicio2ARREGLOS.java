//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le 
//pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra 
//el numero y si se encuentra repetido

package ejercicio2.arreglos;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Ejercicio2ARREGLOS 
{

    
    public static void main(String[] args) 
    {
        int n;
        System.out.println("ingrese n");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        int vector[] = new int [n];
        
        for (int i= 0; i<vector.length; i++)
        {
            vector[i]= (int)(Math.random()*10);
            System.out.println("vector[" + i + "]: " + vector[i]);
        }
        System.out.println("Por favor ingrese un número");
        Scanner leer2 = new Scanner(System.in);
        int b = leer2.nextInt();
        
        int encontrado = 0;
        
        for (int i= 0; i<vector.length; i++)
        {
            if (vector[i] == b)
            {
                
                if(encontrado == 0) //primera vez
                {
                    encontrado=1;
                    System.out.println("Encontré el numero en la posición:" + i );
                }
                else //repetido
                {
                    System.out.println("Lo encontré mas de una vez");
                    break;
                }
                
            }
        }
        
        if (encontrado==0)
        {
            System.out.println("No se encontró el numero");
        }
        
        
        
    }
    
}
