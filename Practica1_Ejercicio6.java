// Pedir el diámetro de un círculo y calcular su área y perímetro.
import java.util.*;
public class Practica1_Ejercicio6{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese el radio del círculo: ");
        double radio = leer.nextDouble();

        double area = 2 * (Math.PI) * radio * radio;

        System.out.println("El área del círculo es: " + area);     
    }
}