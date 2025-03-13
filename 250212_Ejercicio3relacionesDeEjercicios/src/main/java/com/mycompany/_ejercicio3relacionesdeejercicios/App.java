/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio3relacionesdeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer>lista1=new ArrayList<>();
        ArrayList<Integer>lista2=new ArrayList<>();
        
        for(int i=0;i<=10000;i++)
        {
            lista1.add((int)(Math.random()*99)+1);
            lista2.add((int)(Math.random()*99)+1);
        }
        
        ArrayList<Integer>nuevalista = new ArrayList<>();
        
        for(int i=0;i<=10000;i++)
        {
            if(lista1.get(i)>=lista2.get(i))
            {
                nuevalista.add(lista1.get(i));
            }
            else
            {
                nuevalista.add(lista2.get(i));
            }
        }
        int resul=0;
        int media;
        for(Integer elemento:nuevalista)
        {
            resul+=elemento;
        }
        media=resul/10000;
        
        System.out.println("Esta es la primera lista:");
        System.out.println(lista1);
        System.out.println("Esta es la segunda lista:");
        System.out.println(lista2);
        System.out.println("Esta es la nueva lista:");
        System.out.println(nuevalista);
        System.out.println("la media es:"+media);
           
        
    }
}
