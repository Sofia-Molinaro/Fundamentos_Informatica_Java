//Pedir ancho y largo de un terreno y 
//mostrar cuántos paneles de pasto hay que comprar (son de 60x60 cm).
import java.util.*;
public class Practica1_Ejercicio9 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese el ancho del terreno, por favor: ");
        double ancho = leer.nextDouble();
        
        System.out.println("Ingrese el largo del terreno, por favor: ");
        double largo = leer.nextDouble();

        int paneles = (ancho * largo) / 3600;    //3600 es el área de cada panel.

        System.out.println("Tiene que comprar " + paneles + " paneles");
    }
}
