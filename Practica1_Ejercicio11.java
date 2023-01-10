//Diseña un programa que, a partir del valor del lado de un cuadrado (3 metros),
//muestre el valor de su perímetro (en metros) y el de su área (en metros cuadrados). 
//(El perímetro debe darte 12 metros y el área 9 metros cuadrados.)
import javax.swing.*;
public class Practica1_Ejercicio11 {
    public static void main(String[] args){
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado de un cuadrado en metros: "));

        float perimetro = lado * 4;

        float area = lado * lado;

        System.out.println("El perímetro del cuadrado es: "+ perimetro + " metros.");

        System.out.println("El área del cuadrado es: " + area + " m2. ");

    }
}
