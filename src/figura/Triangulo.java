/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Marco
 */
public class Triangulo {
    private double ba;
    private double al;
    
    // Constructor de la clase
   public Triangulo(double ba,double al)
   {
       this.ba = ba;
       this.al= al;
   }
   
   public double GetAl()
   {
       return this.al;
   }
   public double GetBa(){
       return this.ba;
   }

   
    
    
}
