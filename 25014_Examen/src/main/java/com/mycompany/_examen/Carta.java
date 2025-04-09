/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._examen;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Carta 
{
     private String palo;
     private int valor;
  

    public Carta(int valor, String palo)
    {
        //pre:debe ser el palo correcto y el valor(1-12)
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor()
    {
        return valor;
    }

    public String getPalo()
    {
        return palo;
    }

    @Override
    public String toString()
    {
        return "Carta{" + "valor=" + valor + ", palo=" + palo + '}';
    }   
}
