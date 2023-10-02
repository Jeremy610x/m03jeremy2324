/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int num1,num2,num3;
        
        System.out.println("Dime el numero 1 ...");
        num1= sc.nextInt();
        System.out.println("Dime el numero 2 ...");
        num2=sc.nextInt();
        System.out.println("Dime el numero 3 ...");
        num3=sc.nextInt();
        
        if(num1==num2 && num2==num3){
        
            System.out.println("Son todos iguales");
        }
        else if (num1>num2 && num1>num3){
            System.out.println(" es el mayor" + num1);
        }
         else   if (num2>num1 && num2>num3){
            System.out.println("es el mayor" + num2);
        }
         else if (num3>num1 && num3>num2){
            System.out.println(" es el mayor ... " +num3);
        }
         else {
            System.out.println("Error volver a ingresar numeros");
         }
        
        
        
        
        
        
    }
    
}
