/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio5relacionesdeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
       ArrayList<Integer>lista=new ArrayList<>();
       Integer aux;
       for(int i=0;i<=10;i++)
       {
           lista.add((int)(Math.random()*119)+1);
       }
        System.out.println(lista.toString());
       for(int i=0;i<lista.size()-1;i++)
       {
           for(int j=0;j<lista.size()-i-1;j++)
           {
                if(lista.get(j)>lista.get(j+1))
                {
                 aux=lista.get(j+1);
                 lista.set(j+1,lista.get(j));
                 lista.set(j,aux);
                }
           }
           
       }
        System.out.println(lista.toString());
    }
    
}
