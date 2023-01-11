// Pedir un verbo en infinitivo y mostrar su terminación (ar, er o ir).
import javax.swing.*;
public class Practica1_Ejercicio14 {
    public static void main(String[] args){
        String verbo = JOptionPane.showInputDialog("Escriba un verbo en infinitivo, por favor: ");
        
        char antepenultimo = verbo.charAt(verbo.length()-2);
        
        char ultimo = verbo.charAt(verbo.length()-1);

        System.out.print(antepenultimo); System.out.print(ultimo);
    }
}