//Pedir que se ingrese un número e imprimir el triple.
import java.util.*;
public class Practica1_Ejercicio1{
    public static void main(String[] args) {
        //inicio variables para guardar los valores.        
        int numero;
        int numero_triple;

        System.out.println("Ingresa un número: ");

        Scanner escaner = new Scanner(System.in); //escaner para leer el teclado

         numero = escaner.nextInt(); 

         numero_triple = numero * 3;

         System.out.println("El triple de " + numero + " es " + numero_triple);
    }
}
