/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciohora;

/**
 *
 * @author usuario
 */
public class Hora {
    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public void inc(){
        minuto++;
        if(minuto>59)
        {
           minuto=0;
        hora++; 
        }
        
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setHora(int hora) {
        this.hora = hora;
        boolean valido=false;
        if(hora>=0&&hora<=23)
        {
            valido=true;
        }
        return valido;
    }

    public boolean setMinuto(int minuto) {
        this.minuto=minuto;
        boolean valido=false;
        if(minuto<=59){
            valido=true;
        }
       
        return valido;
    }
    @Override
    public void finalize(){
        System.out.println("me muero"); 
    }
    
    @Override
    public String toString() {
        return hora+":"+minuto;
    }
    
    
}
