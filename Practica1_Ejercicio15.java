//: Pedir nombre, apellido, nro. de alumno y comisión que desea suscribirse. 
import javax.swing.*;
public class Practica1_Ejercicio15 {
    public static void main(String[] args){

        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");       
       
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        int numero_alumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de alumno: "));

        int comision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la comisión a la que desea suscribirse: "));

        System.out.print("La solicitud de inscripción a la comisión N°" + comision + " solicitada por el alumno N°: "+ numero_alumno + "; " + apellido + " " + nombre + " está siendo procesada.");
    }
}