/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.pokemon;

/**
 *
 * @author usuario
 */
abstract class Pokemon
{
    protected String nombre;
    protected String entrenador;
    protected int experiencia;
    protected int salud;

    public Pokemon(String nombre, String entrenador, int experiencia, int salud) 
    {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.experiencia = experiencia;
        this.salud = salud;
    }

    public abstract void ataqueRapido();

    public void mostrar()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Salud: " + salud);
    }

    public void ganarExperiencia(int puntos) 
    {
        experiencia += puntos;
        System.out.println(nombre + " ha ganado " + puntos + " puntos de experiencia!");
    }
}


