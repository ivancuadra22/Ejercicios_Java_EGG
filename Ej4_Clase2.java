/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F ֟ 32
+ Մ9 * C / 5Յ
*/

package ejercicio1clase2;

import java.util.Scanner;


public class Ej4_Clase2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double celsius;
        double convertido;
        System.out.println("Ingrese la cantidad de grados Celsius que desea convertir a Fahrenheit");
        celsius = sc.nextDouble();
        convertido = 32 + (9*celsius/5);
        System.out.println("Su valor en Fahrenheit es de: " +convertido);
    }
}
