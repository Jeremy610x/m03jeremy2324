/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdiadelasemana;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class SwitchDiadelaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon un numero del 1 al 7");
        dia = sc.nextInt();
        
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                System.out.println("Es el primer dia de la semana");
                break;
             case 2:
                System.out.println("Martes");
                break;
                
                 case 3:
                System.out.println("Miercoles");
                break;
                
                 case 4:
                System.out.println("Jueves");
                break;
                
                 case 5:
                System.out.println("Viernes");
                break;
                 case 6:
                System.out.println("Sabado");
                break;
                
                 case 7:
                 case 8:    
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia no valido");
                break;
        }
        
    }
    
}
