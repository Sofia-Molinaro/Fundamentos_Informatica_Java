//Pedir que se ingrese un número e imprimir la mitad.
import java.util.Scanner;
public class Practica1_Ejercicio3{
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número, por favor: ");

        int numero = leer.nextInt();

        int mitad = numero / 2;

        System.out.println("La mitad de " + numero + " es " + mitad);
    }

}
