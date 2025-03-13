/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.entornosherencia;

/**
 *
 * @author usuario
 */
public class Clase {
    private String numPlaca;
    private String color;
    private String Modelo; 
    public Clase(String numPlaca,String color,String Modelo)
    {
        this.numPlaca=numPlaca;
        this.color=color;
        this.Modelo=Modelo;
    }
        public void Acelerar()
        {
            System.out.println("Este vehivulo esta Avanzado");
        }
        public void Frenar()
        {
                System.out.println("El coche esta frenando");
        }
        public void CambiarDeVelocidad()
        {
                System.out.println("Esta cambiando la velocidad");
        }

}
