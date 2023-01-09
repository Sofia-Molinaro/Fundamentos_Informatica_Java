// Pedir datos de 4 productos comprados, con su cantidad y precio unitario y mostrar cuánto se gasta por cada producto y el total.
import javax.swing.*;
public class Practica1_Ejercicio10 {
    public static void main(String[] args){
        
        double precio_total = 0;

        for(int i=0; i<4; i++){
            
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
            
            int  cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
            
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de productos:"));
            
            double precio_producto = cantidad * precio;
            
            System.out.println("El precio de " + nombre + " es $"+ precio_producto); 
            
            precio_total = precio_total + precio_producto;
                
            System.out.println("El precio total es: $" + precio_total);
               
        }  
    }
}
