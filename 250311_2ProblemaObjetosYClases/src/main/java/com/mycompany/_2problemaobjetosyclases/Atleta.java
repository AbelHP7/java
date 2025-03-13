/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._2problemaobjetosyclases;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Atleta {
    
    Map<Integer,String>carrera=new HashMap<>();
    
    private String nombre;
    private int número;
    private String nacionalidad;
    private int tiempo;

    public Atleta(String nombre, int número, String nacionalidad, int tiempo) {
        this.nombre = nombre;
        this.número = número;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.tiempo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        return this.tiempo == other.tiempo;
    }
    
    public Map Carrera(){
        int distancia=50000;
        
        carrera.put(tiempo, nombre);
        return carrera;
    }
}
