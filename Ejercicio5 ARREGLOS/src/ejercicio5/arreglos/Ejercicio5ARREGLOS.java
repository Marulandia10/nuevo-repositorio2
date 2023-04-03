/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Realice un programa que compruebe si una matriz dada es antisimétrica. 
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
//pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
//La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package ejercicio5.arreglos;

import java.util.Random;

/**
 *
 * @author emanuel
 */
public class Ejercicio5ARREGLOS 
{

   
    public static void main(String[] args) 
    {
        int n = 3
        Scanner leer = new Scanner(System.in);
        //Random Random r = new Random ();        
        int matriz [][] = {{0, -2, 4},{2, 0, 2}, {-4, -2, 0}};
        
        for (int = 0; i< n; i++ ) 
        {
            for (int j= 0; j < n; j++) 
            {
                if (!(matriz[i][j] == -matriz [j][i]))
                    
            }
            
        }
        
        
    }
    
}
 /*Scanner leer = new Scanner(System.in);

        boolean bandera = true;

        //Random r = new Random();
        //int matriz[][] = new int[n][n];
        
        int matriz[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (!(matriz[i][j] == -matriz[j][i])) {

                    bandera = false;
                    break;

                }

            }

        }

        if (bandera) {

            System.out.println("Es AT.");

        } else {

            System.out.println("No es AT.");
        }