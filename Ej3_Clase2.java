/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas.
 */
package ejercicio1clase2;
        
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ej3_Clase2 {
    public static void main(String [] args){
        Scanner oracion = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase a convertir en mayus y minus:");
        frase = oracion.nextLine();
        System.out.println("Conversion a minus: "+ toUpperCase(frase) );
        System.out.println("Conversion a mayus: "+ frase.toLowerCase() );
    }
}
