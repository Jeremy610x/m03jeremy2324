/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaleecaracteresenteros;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ProgramaLeeCaracteresEnteros {

    /**
     * @param args the command line arguments
     * te va a pedir a que clase vas (A,B.C)
        te va a pedir una edad
        la clase A van los adultos
        la clase C van los menores de edad
        el programa tiene que comprobar que estas en la correcta
     */
    public static void main(String[] args) {             
       // TODO code application logic here
       Scanner sc = new Scanner (System.in);
       int edad;
       char clase;//character
        System.out.println("A que clase vas ?  ");
        clase = sc.next().charAt(0);
        
        
        System.out.println("Vas al grupo " + clase);
        System.out.println("Que edad tienes ?");
        edad = sc.nextInt();
        System.out.println("Tienes " + edad + "años");
        
        if (clase=='A' && edad>=18){
            System.out.println("Vas a la clase correcta " + clase);
        }
        else if //(clase )
                (clase=='B'||clase =='C' && edad<18){
        System.out.println("Vas a la clase correcta" + clase);
    }
//        else if (clase=='C' && edad<18){
//        System.out.println("Vas a la clase correcta" + clase);
//    }
        else{
            System.out.println("Los datos son incorrectos");
        }

    }
    
}
