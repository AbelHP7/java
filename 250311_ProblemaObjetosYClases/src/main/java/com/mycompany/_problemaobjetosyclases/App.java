/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._problemaobjetosyclases;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) 
    {
        Tanque t = new Tanque(5000,0);
        t.agregar(100);
        while(t.getContenido()>=1)
        {
            t.sacaMitad();
        }
        System.out.println(t.toString());
    }
}
