
package ejercicio7guia3;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
//este tipo de dispositivo lee cadenas enviadas por el usuario.
//Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
//el primer carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
//marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando
//la cantidad de lecturas correctas e incorrectas recibidas.
//Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
public class Ejercicio7GUIA3 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        frase = 
        
        
        do {System.out.println("Ingrese una frase de 5 caracteres");
        frase 
        }
        
    }
    
}
//String cadena = "";
        int contTrue = 0;
        int contFalse = 0;
        
        
    
        do  {
            System.out.println("ingrese cadena");
            cadena = leer.nextLine();
            
            if (cadena.length() == 5 && "x".equals(cadena.substring(0, 1)) && "o".equals(cadena.substring(4, 5)) && !("&&&&&".equals(cadena))) {
                System.out.println("ingreso correcto");
                contTrue++;
            } else if (!("&&&&&".equals(cadena))) {
                System.out.println("ingreso incorrecto");
                contFalse++;
            }
        } while (!("&&&&&".equals(cadena)));
        
            System.out.println("ingresos correctos " + contTrue);
            System.out.println("ingresos incorrectos " + contFalse);
    
    }