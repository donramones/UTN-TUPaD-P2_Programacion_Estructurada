/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        // Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un ninio/a");
        }else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente");
        }else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto/a");
        }else{
            System.out.println("Eres un/a Adulto/a mayor");
        }
         
         
    }
}
