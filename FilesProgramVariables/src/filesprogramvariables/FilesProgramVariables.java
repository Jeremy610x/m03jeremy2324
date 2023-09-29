/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesprogramvariables;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class FilesProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        int nota01 =7,nota02=8,nota03=9;
        Scanner pantalla = new Scanner(System.in);
        
     
//        int edad;
//        edad=25;
//        System.out.println("La edad es " + edad);
        /*
        Informar valor usuario
        */
        
        System.out.println("Que nota crees que sacaras en M03?");
        int nota1 = pantalla.nextInt();
        System.out.println("Que nota crees que sacaras en M02?");
        int nota2= pantalla.nextInt();
        
        int nota3= 9;
        
        System.out.println(nota02);
        System.out.println("La nota de m03 es " + nota01);
        System.out.println("lA NOTA DE M02 es  " + nota02);
        System.out.println("La nota de M01 ES "   +nota03 );
        
        
    }
    
}
