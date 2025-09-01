/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_11 {
    private static final double DESCUENTO_ESPECIAL = 0.10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        calcularDescuentoEspecial(precioProducto);
    }
public static void calcularDescuentoEspecial(double precio) {
    double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
    double precioFinal = precio - descuentoAplicado;
     System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado (" + (int)(DESCUENTO_ESPECIAL * 100) + "%): $" + descuentoAplicado);
        System.out.println("Precio final con descuento: $" + precioFinal);
}  
}
