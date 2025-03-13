/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericio913.de.la.pagina299;

/**
 *
 * @author usuario
 */
public class Futbolista implements Comparable {
    protected String dni,nombre;
    protected int edad,nDeGoles;

    public Futbolista(String dni, String nombre, int edad, int nDeGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nDeGoles = nDeGoles;
    }
    
    @Override
    public int compareTo(Object otro){
        Futbolista f=(Futbolista)otro;
        return this.dni.compareTo(f.dni);
    }
    @Override
    public String toString() {
        return "Futbolista{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", nDeGoles=" + nDeGoles + "}";
    }
    
    public boolean equals(Object obj)
    {
        Futbolista otro=(Futbolista)obj;
        return this.dni.equals(otro.dni);
    }
    
}
