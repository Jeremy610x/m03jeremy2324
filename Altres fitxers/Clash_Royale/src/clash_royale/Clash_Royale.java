/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash_royale;

import java.util.Scanner;

/**
 *
 * @author geova
 */
public class Clash_Royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int carta,copes;
        Scanner sc = new Scanner (System.in);
        System.out.println("Quina carta vols Mago Electrico(0), MegaEsbirro(1) ? ");
        carta=sc.nextInt();
        if(carta==0 ){
            System.out.println("Has elegido Mago Electrico " + carta);
        }
        else if(carta==1 ){
            System.out.println("Has elegido MegaEsbirro " + carta);
        }
        System.out.println("Quantes copes tens ? ");
        copes = sc.nextInt();
        if(copes<2000){
           System.out.println("Quina carta vols Mago Electrico(0), MegaEsbirro(1) ? ");
        carta=sc.nextInt(); 
         if(carta==0 ){
            System.out.println("Has elegido Mago Electrico " + carta);
        }
        else if(carta==1 ){
            System.out.println("Has elegido MegaEsbirro " + carta);
        }
       
        }
         else if (copes>3000){
              System.out.println("Quina carta vols Ejercito de esqueletos(0), Gigante noble(1) ? ");
        carta=sc.nextInt(); 
         if(carta==0 ){
            System.out.println("Has elegido  Ejercito de esqueletos " + carta);
        }
        else if(carta==1 ){
            System.out.println("Has elegido Gigante noble " + carta);
        }
        
        } 
        else{
        System.out.println("Quina carta vols Caballero(0), Bandida(1) ? ");
        carta=sc.nextInt(); 
         if(carta==0 ){
            System.out.println("Has elegido Caballero " + carta);
        }
        else if(carta==1 ){
            System.out.println("Has elegido Bandida " + carta);
        }
        }
        
        
        
    }
    
}
