/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._comparable;

/**
 *
 * @author usuario
 */
class Persona implements Comparable<Persona> { // Implementamos Comparable para definir el orden natural
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método compareTo() define el orden natural por edad
    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad); // Compara por edad (orden ascendente)
    }

    @Override
    public String toString() {
        return nombre + " - " + edad;
    }
}
