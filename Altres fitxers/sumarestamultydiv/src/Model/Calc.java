/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author geova
 */
public class Calc {

    int  num1;
    int  num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
   
    public int sumar()
    {
        return num1 + num2;
    }
    
    
    public int restar()
    {
    return num1 - num2;
    }
    
    public int multi()
    {
      return num1 * num2;
    }
    
    public double divid ()
    {
        return  num1 / num2;
    }
}
