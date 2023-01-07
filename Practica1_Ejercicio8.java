//Pedir alto, ancho y largo de una pileta. 
//Calcular el volumen y la cantidad de litros que tiene.
import java.util.*;
public class Practica1_Ejercicio8 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese el alto de la pileta en cm: ");
        double alto = leer.nextDouble();
        
        System.out.println("Ingrese el ancho de la pileta en cm: ");
        double ancho = leer.nextDouble();

        System.out.println("Ingrese el largo de la pileta en cm: ");
        double largo = leer.nextDouble();

        double volumen = (alto * ancho * largo);

        double cantidad_litros = (volumen / 1000);

        System.out.println("El volumen de la pileta es: " + volumen + " cm3. La misma contiene " + cantidad_litros + " litros. ");
    }
}