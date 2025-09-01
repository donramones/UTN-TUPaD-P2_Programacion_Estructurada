/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_9 {
    public static void main(String[] args) {
        String zona;
        double peso, precioProducto;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        System.out.println("El costo de envio es: " + calcularCostoEnvio(peso, zona));
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, peso, zona));
        
        
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
        costoEnvio = peso * 5;
    } else if (zona.equalsIgnoreCase("Internacional")) {
        costoEnvio = peso * 10;
    } else {
        costoEnvio = 0; 
        }
        return costoEnvio;
    } 
    
    
    static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvioTotal = calcularCostoEnvio(peso, zona);
        return precioProducto + costoEnvioTotal;
    }
    
    
    
    
}
