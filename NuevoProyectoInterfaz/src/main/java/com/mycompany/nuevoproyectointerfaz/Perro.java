/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevoproyectointerfaz;

/**
 *
 * @author usuario
 */
public class Perro implements Sonido, Comparable{
     int var;
    public Perro(int var) {
        this.var = var;
    }
    
    public void voz(){
        System.out.println("guau");
    }
    
    public int compareTo(Object otro){
        Perro p=(Perro)otro;
        if(p.var==this.var){
            return 0;
        }
        return var;
    }
        
    
}
