/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        //salida por consola
        System.out.println("Por favor, ingrese 10 números enteros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
                
            }
        }
        System.out.println("\nResumen de números ingresados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
                
    }
    
}
