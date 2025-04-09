/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio4deejerciciosdemapas;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class comprobadorAnagramas {
 // Método para comprobar si dos palabras son anagramas
    public static boolean sonAnagramas(String p1, String p2) 
    {
        // Si las palabras no tienen la misma longitud, no pueden ser anagramas
        if (p1.length() != p2.length())
        {
            return false;
        }
        
        // Crear un mapa para contar la frecuencia de cada letra en p1
        HashMap<Character, Integer> mapa = new HashMap<>();
        
        for (char c : p1.toCharArray()) 
        {
            // Si la letra ya está en el mapa, incrementar su contador, si no, inicializarlo en 1
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }
        
        // Verificar las letras en p2
        for (char c : p2.toCharArray()) 
        {
            // Si la letra no está en el mapa o su contador es 0, no son anagramas
            if (!mapa.containsKey(c) || mapa.get(c) == 0)
            {
                return false;
            }
            // Restar 1 al contador de la letra en el mapa
            mapa.put(c, mapa.get(c) - 1);
        }
        
        // Si todas las letras coinciden en cantidad, son anagramas
        return true;
    }
}
