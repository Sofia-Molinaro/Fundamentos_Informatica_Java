// Pedir que se ingrese 3 notas e imprimir el promedio. 
import java.util.*;
public class Practica1_Ejercicio4{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        float numero1 = leer.nextFloat();

        System.out.println("Ingrese la segunda nota: ");
        float numero2 = leer.nextFloat();

        System.out.println("Ingrese la tercera nota: ");
        float numero3 = leer.nextFloat();

        float promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de las notas ingresadas es: " + promedio);
    }
}