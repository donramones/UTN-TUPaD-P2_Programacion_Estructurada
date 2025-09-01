/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento;
        double precioFinal;
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Integer.parseInt(input.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
        
         
     }
     static double calcularPrecioFinal(double base, double impuesto, double descuento) {
         return base + (base * (impuesto/100.0)) - (base * (descuento/100.0));
     }
    
}
