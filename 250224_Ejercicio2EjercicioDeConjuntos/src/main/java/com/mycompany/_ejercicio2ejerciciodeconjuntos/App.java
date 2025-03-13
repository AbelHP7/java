/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio2ejerciciodeconjuntos;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */public class App {

public static void main(String[] args)
{
        TreeSet<Integer>conjunto= new TreeSet<>();
        ArrayList<Integer>lista= new ArrayList<>();
        do
        {
            int j=(int)(Math.random()*100)+1;
            conjunto.add(j);      
        }while(conjunto.size()<=50);
        for(int i=0;i<100;i++)
        {
            if(conjunto.contains(i)==false)
            {
                lista.add(i);
            }
        }
        System.out.println("La lista de numeros aleatorios es:"+conjunto.toString());

        System.out.println("la lista de los numeros faltantes:"+lista.toString());
}
}
