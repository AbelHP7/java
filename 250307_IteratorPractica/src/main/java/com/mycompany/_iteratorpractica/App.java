/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._iteratorpractica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        // Definimos un array de colores
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
       
        // Creamos un HashMap para almacenar los colores con claves enteras
        Map<Integer, String> colorines = new HashMap<>();
       
        // Número de veces que vamos a insertar colores en el HashMap
        int veces = 3;
        for(int i = 0; i < veces; i++) {
            // Seleccionamos un color aleatorio del array y lo añadimos al HashMap
            colorines.put(i, colores[(int)(Math.random() * 4)]);
        }
        
        // Mostramos el contenido del HashMap antes de eliminar los "Amarillo"
        System.out.println("Mapa antes de eliminar Amarillo: " + colorines);
       
        // Creamos un iterador para recorrer el HashMap
        Iterator<Map.Entry<Integer, String>> itr = colorines.entrySet().iterator();
        while(itr.hasNext()) {
            // Obtenemos la entrada actual (clave-valor)
            Map.Entry<Integer, String> pareja = itr.next();
           
            // Si el valor es "Amarillo", lo eliminamos utilizando el iterador
            if (pareja.getValue().equals("Amarillo")) {
                itr.remove();
            }
        }
       
        // Mostramos el contenido del HashMap después de eliminar los "Amarillo"
        System.out.println("Mapa después de eliminar Amarillo: " + colorines);
    }
}
