/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.pokemon;

/**
 *
 * @author usuario
 */
class Pichu extends Pokemon
{
    public Pichu(String entrenador)
    {
        super("Pichu", entrenador, 0, 100);
    }

    @Override
    public void ataqueRapido()
    {
        int daño = 10;
        double alea=Math.random();
        while(daño<100)
        {
             if(alea>=0.5)
                {
                daño+=10;
                }
        System.out.println(nombre + " usa ataque rápido y causa " + daño + " de daño!");
        }
        ganarExperiencia(15);
    }
}


   

