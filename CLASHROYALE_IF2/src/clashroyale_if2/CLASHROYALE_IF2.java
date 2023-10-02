/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale_if2;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class CLASHROYALE_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int eleccion,copes;
        char personaje;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas has conseguido ? ... ");
        copes = sc.nextInt();
        System.out.println("Escoge carta ...");
        if (copes<2000){
        
            System.out.println("Quina carta vols Mago Electrico(0) , Megaesbirro(1)?");
        }
        else if (copes >=2000 && copes <3000){
         System.out.println("Quina carta vols Caballero (0) , Bandida (1)  ");
        }
        else if (copes>=3000){
            System.out.println("Quina carta vols Ejercito de Esqueletos (0) ,  Gigante noble (1) ?");
        }
        System.out.println("opcion?");
        eleccion =sc.nextInt();
        if (eleccion ==0){
        if(copes <2000){
        
            System.out.println("has escogido mago");
        }
         else if (copes >=2000 && copes <3000){
            System.out.println("Has escogido bandida");
         }
        else if (copes>=3000){
            System.out.println("Esqueletos");
        }
        
        }
        else if (eleccion ==1){
                System.out.println("has escogido megaesbirro ");
        }
         else if (copes >=2000 && copes <3000){
            System.out.println("Has escogido caballero");
         }
        else if (copes>=3000){
            System.out.println("Gigante noble");
        }
        else{
            System.out.println("Opcion no valida");
        }
       
        }
        
        
    
    
}
