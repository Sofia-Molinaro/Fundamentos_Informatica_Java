//Si tuvieras que imprimir mensajes como “Estudiando Matemática I en la UNAJ“ y
//“Estudiando Python en la UNAJ” utilizando la misma función ¿Cómo la modificarías?
import java.util.*;
public class Practica2_Ejercicio2 {
    public static int imprimir_mensaje(int mensaje){
        return mensaje;
    }  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String resultado;
        
        System.out.println("Elija una de las opciones, por favor: Opción 1 - Estudiando Matemática I en la UNAJ; Opción 2 - Estudiando Python en la UNAJ");
        int m = leer.nextInt();

        if (m == 1) {
            resultado = "Estudiando Matemática I en la UNAJ";
            System.out.print(resultado);
        }
        
        else if (m == 2) {
            resultado = "Estudiando Python en la UNAJ";   
            System.out.print(resultado);
        }
        
        else{
            System.out.print("No ingreso ninguna de las opciones. Por favor inténtelo nuevamente. ");
        }
        imprimir_mensaje(m); 
    }
}
