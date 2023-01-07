//Pedir base y altura de un triángulo y mostrar el área del mismo
import java.util.*;
public class Practica1_Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del triángulo en cm: ");
        float base = leer.nextFloat();

        System.out.println("Ingrese la altura del triángulo en cm: ");
        float altura = leer.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("El área del triángulo de base " + base + " y altura " + altura + " es " + area);
    }
}