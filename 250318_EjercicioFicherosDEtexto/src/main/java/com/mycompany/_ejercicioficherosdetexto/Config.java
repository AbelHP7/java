/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicioficherosdetexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 *
 * @author usuario
 */
public class Config {
    private String ruta;
    private HashMap<String,String>contenido = new HashMap<>();

    public Config(String ruta)
    {
        this.ruta = ruta;
        this.leer(ruta);
    }

    public String consultar(String texto)
    {
        if(!contenido.containsKey(texto))
        {
           return null;
        }
        else
        {
            return contenido.get(texto);
        }
       
    }
   
    public void cambiar(String texto,String valor)
    {
        if (contenido.containsKey(texto)) 
        {
            contenido.put(texto, valor);// Actualiza el valor si la clave existe 
            System.out.println("Valor actualizado correctamente.");
        }
        else 
        {
            System.out.println("Error: la clave '" + texto + "' no existe.");
        }
    }
    public void add(String texto,String valor)
    {            
        contenido.put(texto, valor);//añadimos el texto que quiere el usuario
        System.out.println("Texto añadido correctamente.");
    }

    public void delete(String texto)
    {  
        if(contenido.containsKey(texto))
        {
            contenido.remove(texto);
        }
    }
   public void leer(String ruta) {
    contenido.clear(); 
    this.ruta = ruta; // Con esto actualizamos la ruta del archivo

    try (BufferedReader out = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = out.readLine()) != null)
        {
            String[] partes = linea.split("=", 2); // Dividir clave y valor
            if (partes.length == 2)
            {
                contenido.put(partes[0].trim(), partes[1].trim());
            }
        }
        System.out.println("Archivo leído correctamente.");
    } 
    catch (IOException e)
    {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
}

    public void guardar()
    {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(ruta)))
        {
            System.out.println("Archivo se ha guardado correctamente.");
            out.newLine(); //cambio de línea en el archivo
            
            Iterator<Map.Entry<String, String>> itr = contenido.entrySet().iterator();
            while(itr.hasNext()) 
            {
                // Obtenemos la entrada actual (clave-valor)
                Map.Entry<String, String> pareja = itr.next();
                String cad= pareja.getKey()+"="+pareja.getValue();//hacemos una variable con todo
                out.write(cad);//escribe todo el string
                out.newLine();
            }
        }
        catch (IOException e) 
        {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
        
    }
}

