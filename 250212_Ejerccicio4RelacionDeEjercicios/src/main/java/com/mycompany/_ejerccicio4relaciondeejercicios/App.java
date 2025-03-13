/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejerccicio4relaciondeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer>lista=new ArrayList<>();
        for(int i=0;i<=20;i++)
        {
            lista.add((int)(Math.random()*9)+1);
        } 
        ArrayList<Integer>nuevalista=new ArrayList<>();
        for(int i=0;i<=20;i++)
        {
            for(int j=0;j<lista.get(i);j++)
            {
                nuevalista.add(lista.get(i));
            }
        }
        System.out.println(nuevalista);
        ArrayList<Integer>resultadolista=new ArrayList<>();
        for (int i = nuevalista.size() - 1; i >= 0; i--) {
            resultadolista.add(nuevalista.get(i));
        }
        
        System.out.println("Lista en orden inverso: " + resultadolista);
    
       
    }
}
