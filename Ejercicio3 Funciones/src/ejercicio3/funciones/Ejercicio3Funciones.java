/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €



public class Ejercicio3Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros que desea cambiar");
        double euros = leer.nextDouble();
        
        System.out.println("ingrese la moneda a la que desea cambiarla");
        String moneda = leer.next();
        double c =cambioMoneda ( euros ,moneda);
    }
    public static double cambioMoneda (double euros , String moneda) {
     switch (moneda) {
         case "dolar":
             System.out.println("sus " + euros + " en dolares es: " + (euros*1.18));
             break;
         case "yenes":
             System.out.println("sus " + euros + " en yenes es: " + (euros*129.08));
             break;
         case "libras":
             System.out.println("sus " + euros + " en libras es: " + (euros*0.85));
             break;
         default:
                 System.out.println("opcion no valida");         
     }
return 0 ; }