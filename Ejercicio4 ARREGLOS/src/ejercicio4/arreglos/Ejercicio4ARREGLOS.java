
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
//muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
//se obtiene cambiando sus filas por columnas (o viceversa).

package ejercicio4.arreglos;

/**
 *
 * @author emanuel
 */
public class Ejercicio4ARREGLOS 
{

    
    public static void main(String[] args) 
    {
        int [] [] matriz = new int [4] [4];
        int [] [] matrizB = new int [4] [4];
        
        for (int i= 0; i<4; i++)
        {
            for ( int j=0; j<4; j++)
            {
                matriz[i][j]= (int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        //hasta aqui llene la matriz
         System.out.println("========================");
        
         for (int i= 0; i<4; i++)
        {
            for ( int j=0; j<4; j++)
            {
                matrizB[i][j]= matriz[j][i];
                System.out.print(matrizB[i][j]+" ");
            }
             System.out.println(" ");
        }
        
    }
    
}
