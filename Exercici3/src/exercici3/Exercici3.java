/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tambien se puede usar int lado,area;
        double lado,area;
        Scanner sc = new Scanner(System.in);
        //trec ln per el scanner esta a la mateixa linea
        System.out.print("Cuanto mide el lado del cuadrado? ");
        lado = sc.nextDouble();
        area = lado*lado;
        
        System.out.println("El area de un cuadrado de lado "+
                 lado + " es ..." + area);
    }   
}
