/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio2relacionesdeejercicios;

/**
 *
 * @author usuario
 */
public class Palabras {
    private String palabra;

    public Palabras(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabras{" + "palabra=" + palabra + '}';
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
