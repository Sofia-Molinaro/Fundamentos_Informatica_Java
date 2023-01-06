//Imprime el doble de un número.
import java.util.*;
public class Practica1_Ejercicio2 {
    public static void main (String[] args){
    int numero;
    int numero_doble;

    System.out.println("Ingrese un número, por favor: ");
   
    Scanner escaner = new Scanner(System.in);
    
    numero = escaner.nextInt();

    numero_doble = numero * 2;

    System.out.println("El doble de " + numero + " es: " + numero_doble);    
    }   
}
