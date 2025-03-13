/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio1deejerciciosdemapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       
        while(!palabra.equals("fin")){

            if(lista.containsKey(palabra)){
                    lista.put(palabra,lista.get(palabra)+1);
            }
            else{
                    lista.put(palabra,1);
            }
            System.out.println("Introduce palabra");
            palabra=sc.next();
        }
         for (Map.Entry<String, Integer> entry : lista.entrySet()) {
            int frecuente = entry.getValue();
            if (!repes.containsKey(frecuente)) {
                repes.put(frecuente, new ArrayList<>());
            }
            repes.get(frecuente).add(entry.getKey());
        }

        System.out.println("Mapa de frecuencias: " + lista);
        System.out.println("Mapa de repeticiones: " + repes);
    }
}