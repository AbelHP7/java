/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author usuario
 */
public class Persona {
   protected String nombre;
   protected String dni;
   protected int año;
    Persona(String nombre,String dni,int año){
        this.nombre = nombre;
        this.dni = dni;
        this.año = año;
    }
     public int getAño() {
        return 2025-año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", a\u00f1o=" + año + '}';
    }
    
}
