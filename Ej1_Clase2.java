
package ejercicio1clase2;

import java.util.Scanner;


public class Ejercicio1Clase2 {

    public static void main(String[] args) {
       int n1;
       int n2;
       int resultado;
       
       Scanner num = new Scanner(System.in);
       System.out.println("Ingrese el primer numero a sumar:");
       n1 = num.nextInt();
       System.out.println("Ingrese el segundo numero a sumar:");
       n2 = num.nextInt();
       resultado = n1 + n2;
       System.out.println("El resultado de esta suma es:" + resultado);         
    }
}
