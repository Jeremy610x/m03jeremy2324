/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exericici11;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exericici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double num1,num2;
        System.out.println("Dame el numero1 ...");
        num1= sc.nextDouble();
        System.out.println("Dame el numero2 ...");
        num2 = sc.nextDouble();
        
        if(num1==num2){
            System.out.println(" Ambos Son iguales");
        }
        else if (num1>num2)
        {
            System.out.println("El mayor es  "+ num1 + " que numero " + num2);
        }
        else{
            System.out.println("El mayor es " + num2 + " que numero " + num1);
        }
                        
        
    }
    
}
