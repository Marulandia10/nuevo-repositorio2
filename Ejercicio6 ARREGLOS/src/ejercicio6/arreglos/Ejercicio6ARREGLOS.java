/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.arreglos;


   
  
import java.util.Scanner;

public class Ejercicio6ARREGLOS 
{
    public static void main(String[] args) 
    {
//         
        int tamano=3;
        int matriz[][]=new int[tamano][tamano];
        completarPorTeclado(matriz);
        
        if (esMagica(matriz))
        {
            System.out.println("La matriz ES MAGICA");
        } else {
            System.out.println("La matriz NO ES MAGICA");
        }
        
    }
    public static void completarPorTeclado (int mat[][]){
        Scanner leer = new Scanner(System.in);
        int valor;
        for (int i = 0; i < mat[0].length; i++)
        {
            for (int j = 0; j < mat[0].length; j++) 
            {
                System.out.println("Ingrese el valor entre [1 y 9] fila "+(i+1)+" y columna "+(j+1));
                valor = leer.nextInt();
                while (valor<1 || valor>9) {                    
                    System.out.println("Ingreso un valor erroneo, favor de ingresar un valor entre 1 y 9");
                    System.out.println("el valor correspondera fila "+(i+1)+" y columna "+(j+1));
                    valor = leer.nextInt();
                    
                }
            }
        }
    }
    public static Boolean esMagica(int mat[][])
    {
        int comparadorp=0;//comparador de ladiagonal principal
        int comparadorcp=0;
        Boolean magica=Boolean.TRUE;
        //obtengo la suma de lago dianal principal
        for (int i = 0; i < mat.length; i++) 
        {
            comparadorp=comparadorp+mat[i][i];
            comparadorcp=comparadorcp+mat[i][(mat.length-1)-i];
            }
        //System.out.println(comparadorp+"  "+comparadorcp);
        if (comparadorp!=comparadorcp)
        {
            magica=Boolean.FALSE;
        } else {
            //compruebo las filas y Columnas
                int sumaf=0; 
                int sumac=0;
             for (int i = 0; i < mat.length; i++)
             {
                
                for (int j = 0; j < mat.length; j++)
                {
                    sumaf=sumaf+mat[i][j];
                    sumac=sumac+mat[j][i];
                    
                 }
                    int j= 0;
                 System.out.println(sumaf + " " + mat[i][j]);
                 System.out.println(sumac);
                 if (!(sumaf==comparadorp && sumac==comparadorp)) {
                     magica=Boolean.FALSE;
                     break;
                 } 
                 
            }
        }
        
        //compruebo las columnas
        
        return magica;
        
    }

}