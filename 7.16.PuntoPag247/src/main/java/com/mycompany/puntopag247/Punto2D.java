/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntopag247;

/**
 *
 * @author usuario
 */
public class Punto2D {
  public double x, y;
    Punto2D(){

    }
    Punto2D(double x, double y){
        setValores(x,y);
    }
    public void desplazaX (double dx){
        this.setX(this.getX()+dx);
    }
    public void desplazaY(double dy){
        this.setY(this.getY()+dy);
    }
    public void desplaza(double dx, double dy){
        desplazaX(dx);
        desplazaY(dy);
    }
    public double distanciaEuclidea(Punto2D otro){
        double distancia=0;
        distancia=(Math.sqrt(
                Math.pow((this.getX()-otro.getX()), 2)+
                Math.pow((this.getY()-otro.getY()), 2)));
        return distancia;
    }
    public double getX(){
        return (this.x);
    }
    public double getY(){
        return(this.y);
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setValores(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void muestra(){
        System.out.println(this.getX());
        System.out.println(this.getY());
    }
}


   
