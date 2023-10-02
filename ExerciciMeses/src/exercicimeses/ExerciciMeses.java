/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicimeses;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ExerciciMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char mes;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime una letra (e,f,m,a)...");
        mes = sc.next().charAt(0);
        
        switch (mes) {
            case 'e':
            case 'E':
                System.out.println("Enero");
                break;
                    case 'f':
                    case 'F':
                System.out.println("Febrero");
                break;
                    case 'm':
                    case 'M':
                System.out.println("Marzo");
                break;
                    case 'a':
                    case 'A':
                System.out.println("Abril");
                break;
                
            default:
                System.out.println("Letra  no valida");
                break;
        }
        
        
    }
    
}
