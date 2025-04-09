/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Carlos", 20));
        personas.add(new Persona("Beatriz", 30));

        // Ordenar usando Comparator (criterio: por nombre)
        Collections.sort(personas, new ComparadorPorNombre());
        System.out.println("Ordenadas por nombre (Comparator): " + personas);
    }
}
