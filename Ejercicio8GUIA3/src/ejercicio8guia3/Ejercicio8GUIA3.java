//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

package ejercicio8guia3;

import java.util.Scanner;


public class Ejercicio8GUIA3 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
       
        int n;
      
      
        System.out.println("ingrese numero");
        n = leer.nextInt();
          
              
        for (int i = 0; i < n; i++)
        {
          
            for (int j = 0; j < n; j++)
            {
                
            
                if (j > 0 && j < n-1 && i > 0 && i < n-1)
                {
                    System.out.print(" ");
                } 
                else 
                {
                    System.out.print("*");    
                }
            }
          System.out.println("");
        }
    }
}