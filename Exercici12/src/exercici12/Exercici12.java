/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime el numero...");
        num= sc.nextInt();
        if(num>=0){
        
            System.out.println("Es positivo");
        }
        else{
            System.out.println("Es negativo");
        }
        
    }
    
}
