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
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
       
        Map<Integer, String> colorines = new HashMap<>();
       
             
        int veces = 3;
        for(int i=0; i<veces; i++)
        {
            colorines.put(i, colores[(int)(Math.random()*4)]);
        }
        System.out.println(colorines);
       
        //usando un iterador, borrar los amarillos
        Iterator<Map.Entry<Integer, String>> itr = colorines.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> pareja = itr.next();
           
            if (pareja.getValue().equals("Amarillo") == true)
            {
                itr.remove();
            }
        }
       
        System.out.println(colorines);

    }
}
