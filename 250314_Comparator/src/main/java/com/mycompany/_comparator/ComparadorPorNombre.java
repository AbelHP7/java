/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._comparator;

/**
 *
 * @author usuario
 */
class ComparadorPorNombre implements Comparator<Persona> { // Implementamos Comparator para comparar por nombre
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.nombre.compareTo(p2.nombre); // Compara alfabéticamente los nombres
    }
}
