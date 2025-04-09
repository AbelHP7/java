/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        // Lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Carlos", 20));
        personas.add(new Persona("Beatriz", 30));

        // Ordenar usando Comparable (orden natural: por edad)
        Collections.sort(personas); 
        System.out.println("Ordenadas por edad (Comparable): " + personas);
    }
}
