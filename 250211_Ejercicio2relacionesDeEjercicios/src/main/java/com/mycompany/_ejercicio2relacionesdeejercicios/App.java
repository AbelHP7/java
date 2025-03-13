/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio2relacionesdeejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
       
        String[]palabras;
        String cadena;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la palabra que quieras leer");
        cadena=sc.nextLine();
        
        palabras=cadena.split(" ");
        System.out.println(Arrays.toString(palabras));
        
        
        ArrayList<String>Lista=new ArrayList<>();
       Lista.addAll(Arrays.asList(palabras));
        System.out.println(Lista);
        
        
        for(String palabra : Lista)
        {
            
        }
        
        
        
        
        
        

    }
}
