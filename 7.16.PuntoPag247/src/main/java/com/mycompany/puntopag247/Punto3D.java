/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntopag247;

/**
 *
 * @author usuario
 */
public class Punto3D extends Punto2D {
    
    public double z;
    Punto3D(){
        
    }
    Punto3D(double x, double y, double z){
        super(x,y);
        setZ(z);
        
    }
    public void setZ(double z){
        this.z=z;
    }
    public void setValores(double x, double y, double z){
        super.setValores(x, y);
        this.setZ(z);
    }
    public double getZ(){
        return(this.z);
    }
    public void desplazaZ(double dz){
        this.setZ(this.getZ()+dz);
    }
    public void desplaza(double dx, double dy, double dz){
        super.desplaza(dx, dy);
        this.desplazaZ(dz);
    }
    public void muestra(){
        super.muestra();
        System.out.println(this.getZ());
    }
    public double distancia(Punto3D otro){
        double cantidad;
        
        cantidad=Math.sqrt(
                (Math.pow(this.getX()-otro.x,2))+
                (Math.pow(this.getY()-otro.getY(),2))+
                (Math.pow(this.getZ()-otro.getZ(),2)));
        return cantidad;
    }
    public String toString(){
        String palabra;
        palabra=("Las coordenadas son: X:"+this.x+" Y:"+this.y+" Z:"+this.z);
        return palabra;
    }
    public boolean equals(Punto3D otro){
        if(this.getX()==otro.x&&this.getY()==otro.getY()&&this.getZ()==otro.getZ()){
            return true;
        }
        else{
            return false;
        }
    }    
}


