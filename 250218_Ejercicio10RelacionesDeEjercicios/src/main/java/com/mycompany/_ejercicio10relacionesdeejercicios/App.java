/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio10relacionesdeejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
       ArrayList<Integer>lista=new ArrayList<>();
       ArrayList<Integer>listaOrdenada=new ArrayList<>();
       ArrayList<Integer>resul=new ArrayList<>();
       
       for(int i=0;i<500;i++)
       {
           lista.add((int)(Math.random()*50)+1);    
       }
       
       for(int i=0;i<lista.size();i++)
       {
           if(lista.indexOf(i)!=lista.lastIndexOf(i))
           {
               resul.add(i);
           }
           
       }     
       
        
       Collections.sort(resul);
       System.out.println(resul);
    }
}
