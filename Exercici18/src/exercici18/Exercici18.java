/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double horas,calculo,tarifanormal=20;    
        char nombre;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime tu nombre...");
        nombre = sc.next().charAt(0);
        System.out.println("Horas trabajadas?");
        horas=sc.nextInt();
        
        
        if(horas>=35){
        calculo = horas * tarifanormal * 1.5;
        
        }else{
        
        calculo = horas*tarifanormal;
        }
  
        
        
        System.out.println( "Señor/a " + nombre + " tienes de salario " + calculo);
       
        
    }
    
}
