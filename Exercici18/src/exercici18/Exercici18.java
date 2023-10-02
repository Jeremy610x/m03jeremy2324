/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18;

import java.util.Scanner;

/**
 *
 * @author geova
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double horas,t_normal=20,horas_normal=35,salario;  
    
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Escribe las horas trabajadas ...");
        horas = sc.nextDouble();
        if(horas>horas_normal){
        double h_extra = horas - horas_normal;
        double salario_extra = h_extra * t_normal *1.5;
        double salario_normal = horas_normal*t_normal;
        salario = salario_extra +salario_normal;        
                
        
        
        }
        else{
        
        salario = horas*t_normal;
        }
        
        System.out.println("Tienes de salario " + salario);
    
    
    }
    
    
}
