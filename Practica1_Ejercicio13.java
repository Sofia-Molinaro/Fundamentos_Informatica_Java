//Pedir tres palabras y mostrar un texto con las iniciales de las tres.
import javax.swing.JOptionPane;
public class Practica1_Ejercicio13 {
    public static void main(String[] args){
        for(int i = 0; i<3; i++){
            String palabra = JOptionPane.showInputDialog("Ingrese la palabra N°: "+(i+1));
            
            System.out.print(palabra.charAt(0) );   
        }
        
    }
}