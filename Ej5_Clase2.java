/*
 Escribir un programa que lea un número entero por teclado y muestre
 por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package ejercicio1clase2;

import java.util.Scanner;


public class Ej5_Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 
        int doble;
        int triple;
        double raiz;
        System.out.println("Ingrese un numero entero que desea saber su doble, triple y su raiz cuadrada:");
        num = sc.nextInt();
        doble = num + num;
        triple = num + num + num;
        System.out.println("Su doble es: " +doble);
        System.out.println("El triple de ese numero es: " +triple);
        System.out.println("La raiz del numero es: " + Math.sqrt(num));
        
        
    }
            
}
