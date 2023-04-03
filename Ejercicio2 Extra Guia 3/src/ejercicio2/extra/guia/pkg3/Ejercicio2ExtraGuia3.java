//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
//A continuación, realizar las instrucciones necesarias para que:
//B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package ejercicio2.extra.guia.pkg3;

import java.util.Scanner;

public class Ejercicio2ExtraGuia3 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int A, B, C, D, aux;
        A=1;
        B=5;
        C=10;
        D=6;
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        aux= B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        
      
                    
      
    }
    
}
