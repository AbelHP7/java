/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio12.pag412;

import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class Jugador {
   private String Dni;
   private String nombre;
   private String posicion;
   private double estatura;

   public Jugador(String Dni, String nombre, String posicion, double estatura) 
   {
        this.Dni = Dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
   }
   static void altaJugador(TreeMap<Integer,Jugador>plantilla, Integer dorsal)
   {
       if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, Jugador);
        } 
        else 
        {
            System.out.println("El dorsal " + dorsal + " ya está asignado.");
        }
   }
   static Jugador eliminarJugador(TreeMap<Integer, Jugador>plantilla,Integer dorsal)
   {
       return plantilla.remove(dorsal);
   }
   static void mostrar(TreeMap<Integer, Jugador>plantilla)
   {
      
       
   }
   static void mostrar(TreeMap<Integer, Jugador>plantilla, String posicion)
   {
       
   }
   static boolean editarJugador(TreeMap<Integer, Jugador>plantilla, Integer dorsal)
   {
        if (plantilla.containsKey(dorsal)) {
            Jugador jugador = plantilla.get(dorsal);
            return true;
        }
        return false;
   }
   
   
}

