/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidadVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad de productos recibidos: ");
        int cantidadRecibida = sc.nextInt();

       
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        
        System.out.println("El nuevo stock es: " + nuevoStock);
    }
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
                
                
    }
}
