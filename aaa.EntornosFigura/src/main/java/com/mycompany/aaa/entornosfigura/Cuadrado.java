/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aaa.entornosfigura;

/**
 *
 * @author usuario
 */
public class Cuadrado extends rectangulo {
    protected double lado;
   
    Cuadrado(String color,double base,double altura,double lado){
        super(color,base,altura);
        this.lado=lado;
    }
    public double getLado(){
        return lado;
    }
    public void setlado(double lado){
       this.lado=lado;
    }
    public double calcularArea(){
        return lado*lado;
    }
}

