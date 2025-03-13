/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aaa.entornosfigura;

/**
 *
 * @author usuario
 */
public class rectangulo extends Figura{
   protected double base;
   protected double altura;
   
  
    rectangulo(String color,double base, double altura){
       super(color);
       this.altura=altura;
       this.base=base;
    }
    public double getaltura(){
        return altura;
    }
    public void setaltura(double altura)
    {
       this.altura=altura;
    }
     public double getbase(){
        return base;
    }
    public void setbase(double base)
    {
       this.base=base;
    }
       public double CalcularArea(){
        return base*altura;
    }
    
   
}

