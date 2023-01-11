// Pedir cuatro datos, quién, qué hizo, cuándo y cómo. 
import javax.swing.*;
public class Practica1_Ejercicio16 {
    public static void main(String[] args){
        
        String quien = JOptionPane.showInputDialog("¿Quién realizó el hecho?");

        String que = JOptionPane.showInputDialog("¿Qué sucedió en el hecho?");

        String cuando = JOptionPane.showInputDialog("¿Cuándo sucedió el hecho?");

        String como = JOptionPane.showInputDialog("¿Cómo sucedió el hecho?");

        System.out.print("¡Última noticia!,  " + cuando +", "+ quien + " " + que + ". "+ como);
    }
}