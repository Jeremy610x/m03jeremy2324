/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author geova
 */
public class exercici5 {
    public static void main(String[] args) {
          Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Inserte radio  : ");
        int radio = pantalla.nextInt();
        double pi = 3.14;
        double  diametro = radio *2;
        double longitud = pi *diametro;
        double area = pi * radio *radio;
        
        
        System.out.println("La longitud es " + longitud);
        System.out.println("L area es " + area);
        
    }
    
    
}
