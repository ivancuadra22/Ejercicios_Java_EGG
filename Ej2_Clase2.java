//Escribir un programa que pida tu nombre, lo guarde en una variable y lo
//muestre por pantalla
package ejercicio1clase2;

import java.util.Scanner;

public class Ej2Clase2 {
   
    public static void main(String[] args){
    
    String nombre;//definimos una variable que almacene el nombre
    Scanner leer = new Scanner(System.in); //solicitamos la funcion de Scanner para almacenar variables
    System.out.println("Ingrese su nombre:");//Solicitamos el nombre del usuario
    nombre = leer.next();// Se guarda el nombre en la variable
    System.out.println("Su nombre es:"+nombre+".");//Se imprime el nombre del usuario
    
    }
}
