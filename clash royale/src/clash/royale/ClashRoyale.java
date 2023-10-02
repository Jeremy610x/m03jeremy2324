/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.royale;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int carta,copes;
        char personaje;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina carta vols Mago Electrico(0) , Megaesbirro(1)? ");
        carta = sc.nextInt();
        
        
        //Exercici 1 
        if(carta==0){
        
            System.out.println("Has elegido Mago Electrico" + carta);
            
        }
        else if (carta==1){
          System.out.println("Has elegido MegaEsbirro" + carta);
        
       
        }
        
       // Exercici2
        System.out.println("Quantes copes tens ?");
       copes =sc.nextInt();
       if (copes<2000){
           System.out.println("Quina carta vols Mago Electrico 0,Megaesbirro 1 ?");
           carta = sc.nextInt();
           if(carta==0){
           
               System.out.println("Has elegido mago electrico");
           }
           else if (carta==1){
               System.out.println("Has elegido megaesbirro");
           }

       
       }
        else if (copes >=2000 && copes <3000){
         System.out.println("Quina carta vols Caballero 0 , Bandida 1  ");
        carta = sc.nextInt();
        if (carta ==0){
        
            System.out.println("Has elegido a caballero");
        }
        else if (carta ==1){
        
            System.out.println("Has elegido bandida");
        
        }
        else if (copes>=3000){
            System.out.println("Quina carta vols Ejercito de Esqueletos 0 ,  Gigante noble 1 ?");
            carta = sc.nextInt();
            if (carta ==0){
                System.out.println("Has elegido Ejercito de Esqueletos");
            } 
           else if (carta==1){
        
            System.out.println("Has elegido Gigante noble");
        }
        }
       

        } 
         //  Exercici 3 y 4
       
        System.out.println("Quina carta vols Mago Electrico(m) , Megaesbirro(e)? ");

        personaje = sc.next().charAt(0);
        if(personaje =='m' || personaje =='M'){
            System.out.println("Has elegido el mago Electrico");
        
        }
        else if (personaje == 'e'|| personaje =='E'){
            System.out.println("Has elegido al MegaEsbirro");
        }
    }
    
}
