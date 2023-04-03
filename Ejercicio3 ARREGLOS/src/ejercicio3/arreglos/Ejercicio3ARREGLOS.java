
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicio3.arreglos;

import java.util.Scanner;
import java.util.Random;


public class Ejercicio3ARREGLOS 
{

   
    public static void main(String[] args) 
    {  
        int n;
        System.out.println("ingrese n");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        int vector[] = new int [n];
        Random r= new Random();
        
       for (int i=0; i<n; i++)
       {
           
           vector[i]= r.nextInt(99999);
          
       }
        System.out.println("---------------"); 
        
        int contab1 = 0 contab2 = 0, contab3 = 0, contab4= 0; contab5= 0;
        
        
        
              
        for (int i= 0; i<n; i++)
        {
            if (vector[i] <10)
            {
                contab1++; 
                continue; 
                
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
        System.out.println(" la cantidad de numeros de un solo digito es :" + contab);
    }
    
}

   /* public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random R = new Random();
        int cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        int[] vector;

        System.out.println("Por favor ingrese el tamaño del vector: ");

        vector = new int[leer.nextInt()];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = R.nextInt(99999);

        }

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < 10) {

                cont = cont + 1;

                continue;
            }

            if (vector[i] < 100 && vector[i] > 9) {

                cont1 = cont1 + 1;
                continue;
            }

            if (vector[i] < 1000 && vector[i] > 99) {

                cont2 = cont2 + 1;

                continue;
            }

            if (vector[i] < 10000 && vector[i] > 999) {

                cont3 = cont3 + 1;

                continue;
            }

            if (vector[i] < 100000 && vector[i] > 9999) {

                cont4 = cont4 + 1;

            }

        }

        System.out.println("Se encontraron " + cont + " de 1 dígito.");
        System.out.println("Se encontraron " + cont1 + " de 2 dígitos.");
        System.out.println("Se encontraron " + cont2 + " de 3 dígitos.");
        System.out.println("Se encontraron " + cont3 + " de 4 dígitos.");
        System.out.println("Se encontraron " + cont4 + " de 5 dígitos.");

    }

}