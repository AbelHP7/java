/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio8relacionesdeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) 
    {
        ArrayList<Integer>impares=new ArrayList<>();
        ArrayList<Integer>pares=new ArrayList<>();
        ArrayList<Integer>resul=new ArrayList<>();
        
        
        for(int i=0;i<=99;i++)
        {
            if(i%2!=0)
            {
                impares.add(i);
            }    
        }
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                pares.add(i);
            }    
        }
        for (int i = 0; i < pares.size(); i++) 
        { 
            resul.add(pares.get(i)); 
            if (i < impares.size()) 
            { 
                resul.add(impares.get(i)); 
            }
        }
        System.out.println(resul.toString());
        

        
        
    }
}
