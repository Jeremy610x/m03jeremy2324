/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author geova
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Inserte lado 1 : ");
        int lado1 = pantalla.nextInt();
        
        System.out.println("Inserte lado 2 : ");
        int lado2 = pantalla.nextInt();
        
        int area = lado1 * lado2;
        
        System.out.println("El area es " + area);
        
    
    
    }
    
}
