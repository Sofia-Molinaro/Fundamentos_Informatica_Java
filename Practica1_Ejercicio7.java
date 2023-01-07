//Pedir 2 números y mostrar la división entre ellos y el resto.
import java.util.*;
public class Practica1_Ejercicio7{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese un dividendo de la división: ");
        int dividendo = leer.nextInt();

        System.out.println("Ingrese otro divisor de la división: ");
        int divisor = leer.nextInt();

        int cociente = (dividendo / divisor); 

        int resto = (dividendo - ( cociente * divisor));

        System.out.println("El resultado de la división entre " + dividendo + " y " + divisor + " es " + cociente);
        System.out.print("El resto de la división entre " + dividendo + " y " + divisor + " es " + resto);
    }
}