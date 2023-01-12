//Pedir nombre, apellido de una persona y el día, mes, año en que nació. Armarle una
//clave con esos datos (su clave seria sus iniciales seguido de un guión bajo y de su año de
//nacimiento) y mostrarla.
import javax.swing.*;
public class Practica1_Ejercicio17{
    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre, por favor: ");

        String apellido = JOptionPane.showInputDialog("Ingrese su apellido, por favor: "); 

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su día de nacimiento: "));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento (en números): "));
        
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));

        System.out.print("Su clave es: " + nombre.charAt(0) + apellido.charAt(0) + "_" + anio);

    }
}