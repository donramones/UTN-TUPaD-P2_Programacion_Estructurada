/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double porcentajeDescuento = 0.0;
        double descuento = 0.0;
        //solicitar el precio
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();
        //solicitar categoria
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = sc.next().charAt(0);
        
        //Descuento según la categoría
        switch (categoria) {
            case 'A':
                porcentajeDescuento = 0.10;
                break;
            case 'B':
                porcentajeDescuento = 0.15;
                break;
            case 'C':
                porcentajeDescuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará descuento.");
                porcentajeDescuento = 0;
                break;
                
        }
        descuento = precioOriginal * porcentajeDescuento;
        double precioFinal = precioOriginal - descuento;
        //resultados
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
