/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextInt();
        }while (nota < 0 || nota > 10);
        System.out.println("La nota ingresada es: " + nota);
        
    }
    
}
