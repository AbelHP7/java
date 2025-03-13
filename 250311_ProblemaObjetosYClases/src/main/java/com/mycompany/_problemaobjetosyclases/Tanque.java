/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._problemaobjetosyclases;

/**
 *
 * @author usuario
 */
public class Tanque {
    private int capMax=5000;
    private int cap;

    public Tanque(int capMax,int cap)
    {
        this.capMax=capMax;
        this.cap=cap;
    }

    public int getContenido() {
        return cap;
    }
    public int agregar(int cant)
    {
        
        if(cap+cant>capMax)
        {
            System.out.println("Has superado las cantidad maxima");
        }
        else
        {
           return cap+cant; 
        }
        return cap;
    }
    public int sacar(int cant)
    {
        if(cant>cap)
        {
            System.out.println("No hay suficente cantidad");
        }
        else
        {
            return cap-cant;
        }
        return cap;
    }
    public int sacaMitad()
    {
        cap=cap/2;
        return cap;
    }

    @Override
    public String toString() {
        return "cap=" + cap;
    }
    
    
}
