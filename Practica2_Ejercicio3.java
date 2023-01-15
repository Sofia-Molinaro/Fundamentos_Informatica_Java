//Definir una función denominada imprimo_fecha que reciba tres cadenas de
//caracteres como parámetros formales, que representan un día, un mes y un año e imprima
//la fecha de la siguiente manera: “ 21 de septiembre de 2021”.
import javax.swing.*;
public class Practica2_Ejercicio3{
    public static String imprimo_fecha(String d, String m, String a);

    public static void main(String[] args)
    {
        String dia, mes, anio;
        
        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un día, por favor: ")));
        System.out.println(JOptionPane.showInputDialog("Ingrese un mes, por favor: "));
        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año, por favor: ")));
        
        System.out.println(imprimo_fecha(dia, mes, anio));

        // System.out.println(dia + " de " + mes + " de " + anio);
    
    }

    public static String imprimo_fecha(String d, String m, String a)
    {
        return d + " de " + m + " de " + a;
    }
}