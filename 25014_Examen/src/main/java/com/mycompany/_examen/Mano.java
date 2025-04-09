/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._examen;


import java.util.*;
/**
 *
 * @author usuario
 */
public class Mano {

    private List<Carta> cartas;

    // Constructor que usa los métodos de Baraja para obtener 5 cartas
    public Mano(Baraja baraja) {
        cartas = new ArrayList<>();
        baraja.mezclar(); // Mezclamos la baraja antes de robar cartas

        for (int i = 0; i < 5; i++)
        {
            Carta cartaRoba = baraja.robar(); // Usamos el método robar() de Baraja
            if (cartaRoba != null) 
            {
                cartas.add(cartaRoba);
            } 
            else 
            {
                System.out.println("La baraja se ha quedado sin cartas antes de completar la mano.");
                
            }
        }
    }

    // Método para mostrar las cartas en la mano
    public void mostrarMano()
    {
        if (cartas.isEmpty())
        {
            System.out.println("No tienes cartas en la mano.");
        }
        else
        {
            System.out.println("Tu mano:");
            for (Carta carta : cartas) 
            {
                System.out.println(carta);
            }
        }
    }  
}


