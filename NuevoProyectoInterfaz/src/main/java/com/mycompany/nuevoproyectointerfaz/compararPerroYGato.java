/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevoproyectointerfaz;

import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class compararPerroYGato implements Comparator{
    public int compare(Object ob1,Object ob2)
    {
        Gato g=(Gato)ob1;
        Perro P=(Perro)ob2;
        return g.var-P.var;
    }
    
}
