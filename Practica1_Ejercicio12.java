import javax.swing.JOptionPane;

//Pedir que se ingrese un nombre e imprimir un saludo, ejemplo: 'Hola Pablo'
public class Practica1_Ejercicio12 {
    public static void main (String[] args){
        String nombre = JOptionPane.showInputDialog("Ingrese un nombre, por favor: ");

        System.out.println("Hola " + nombre);
    }
}