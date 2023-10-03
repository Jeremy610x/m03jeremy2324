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
        
        
        
     int horas,h_extra;
     int horas_normal=35;
     
     final double t_normal=20;
     final double precio_extra=1.5;
     double salario,salario_extra,salario_normal;
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas trabajas ? ");
     horas = sc.nextInt();
     
     if (horas>horas_normal){
     
      h_extra = horas - horas_normal;
            
      salario_extra = h_extra * t_normal *precio_extra;
      salario_normal = horas_normal *t_normal;
      
     
     salario = salario_extra + salario_normal;
   
     }
     
     else{
     
     salario = horas * t_normal;
     }
 
        System.out.println("Tienes de salario bruto ...  " + salario );
    
    final int SALARIOSINIMPUESTOS =500;
    final int SALARIOTOPEIMPUESTO =900;
    double impuestos = 0;
 
    double Salario_impuestos,Salarios_topeimpuesto;
    //calcul impuestos
      if (salario>SALARIOTOPEIMPUESTO){
      
      }
     if (salario>SALARIOSINIMPUESTOS){
              Salario_impuestos = salario - SALARIOSINIMPUESTOS;
              
              impuestos =(Salario_impuestos * 25)/100;
              System.out.println("Impuestos ..." + impuestos);
     }
     else{
     impuestos=0;
     }
     salario = salario - impuestos;
        System.out.println("SALARIO NETO ... " + salario);
    
    
    }
    
    
    
    
    
    
    
    
    
    }


