/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exericici16;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exericici16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);        
        double nota;
        System.out.println("Dime la nota ... ");
        nota = sc.nextDouble();
        if(nota<0 || nota>10){
        
            System.out.println("Error en la nota, no es valida");
        }
        else
        {
         
         if (nota>=0 && nota<3){
            System.out.println("Muy deficiente");
        }        
        else if (nota>=3 && nota<5){
            System.out.println("Insuficiente");
        }
        else if (nota>=5 && nota<6){
            System.out.println("Bien");
        }
        else if (nota>=6 && nota<9){
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<=10){        
            System.out.println("Sobresaliente");
        }
        }
        
    
        
        
   
    }    
}
