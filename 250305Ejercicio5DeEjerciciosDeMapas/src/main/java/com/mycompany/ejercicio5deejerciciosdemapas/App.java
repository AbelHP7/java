/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5deejerciciosdemapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class App 
{

    public static void main(String[] args) 
    {       
        
        Scanner sc=new Scanner(System.in);
        
        HashMap<String,Integer>lista=new HashMap<>();
        String palabra;
       
        System.out.println("Introduce la primera palabra");
        palabra=sc.next();
        
        
        while(!palabra.equals("fin"))
        {

            if(lista.containsKey(palabra))
            {
                    lista.put(palabra,lista.get(palabra)+1);
            }
            else
            {
                    lista.put(palabra,1);
            }
            System.out.println("Introduce palabra");
            palabra=sc.next();
        }
        System.out.println(lista.toString());
        
          String palabraMasFrecuente = null;
        int maxFrecuencia = 0;
        
        for (Map.Entry<String, Integer> entry : lista.entrySet()) 
        {
            if (entry.getValue() > maxFrecuencia)
            {
                palabraMasFrecuente = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        
        System.out.println("Lista de palabras y sus frecuencias: " + lista);
        if (palabraMasFrecuente != null) 
        {
            System.out.println("La palabra más repetida es: " + palabraMasFrecuente + " con " + maxFrecuencia + " apariciones.");
        } 
        else
        {
            System.out.println("No se ingresaron palabras.");
        }
        
    }
}
