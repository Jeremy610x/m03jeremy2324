/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
          int num1,num2;
          System.out.println("Dime numero1...");
          num1=sc.nextInt();
            System.out.println("Dime numero2...");
          num2=sc.nextInt();
          if(num1==num2){
              System.out.println("Son ambos iguales");
          
          }
          else if (num1>num2){
              System.out.println(num1 + " , "+ num2);
          
          }
          else{
          
              System.out.println(num2 + " , "+ num1 );
          }
          
    }
    
}
