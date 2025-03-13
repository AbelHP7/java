/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio12.pag412;

import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
TreeMap<Integer, Jugador> equipo = new TreeMap<>();
        altaJugador(equipo, 10, new Jugador("12345678A", "Lionel Messi", "Delantero", 1.70));
        altaJugador(equipo, 1, new Jugador("87654321B", "Iker Casillas", "Portero", 1.82));
        
        System.out.println("Plantilla completa:");
        mostrar(equipo);

        System.out.println("\nJugadores en posición Delantero:");
        mostrar(equipo, "Delantero");

        System.out.println("\nEditando jugador con dorsal 10:");
        if (editarJugador(equipo, 10, "Centrocampista", 1.72)) {
            System.out.println("Jugador actualizado.");
        } else {
            System.out.println("No se encontró el jugador.");
        }
        mostrar(equipo);    }
}
