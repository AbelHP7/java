/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._iteratorenmapa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
     // Crear un mapa con nombres y edades
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("Carlos", 28);

        // Recorrer el mapa con for-each
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años.");
        }
    }
}