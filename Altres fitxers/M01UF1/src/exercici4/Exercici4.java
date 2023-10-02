/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author geova
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Inserte numero 1 : ");
        int num1 = pantalla.nextInt();
        
        System.out.println("Inserte numero 2 : ");
        int num2 = pantalla.nextInt();
        
        int suma= num1 +num2;
        int resta= num1 -num2;
        int multiplicacio = num1 *num2;
        int divisio = num1 / num2;
        
        
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacio es " + multiplicacio);
        System.out.println("La divisio es " + divisio );
    }
    
}
