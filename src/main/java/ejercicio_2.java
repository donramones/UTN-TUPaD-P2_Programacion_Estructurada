/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingrese un primer numero entero: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese un segundo numero entero: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese un tercer numero entero: ");
        num3 = Integer.parseInt(sc.nextLine());
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        }else  if (num1 < num2 && num2 > num3) {
            System.out.println("El mayor es " + num2);
        }else {
            System.out.println("El mayor es " + num3);
            
        }
    }

    
}
