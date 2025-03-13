/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._arrayslist_primitiva;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer>primitiva=new ArrayList<>();
        
        do{
            int posible= (int)(Math.random()*49+1);
            if(primitiva.contains(posible)==false)//da true o false segun este o no 
            {
             primitiva.add(posible);   
            }
        }while(primitiva.size()<6);
        
        Collections.sort(primitiva);
        
        primitiva.sort((new CompararInteger()).reversed());//lo ordena a reves con reversed
        
        System.out.println(primitiva.toString());
        
        for(int i=0; i<primitiva.size();i++)
        {
            System.out.println(primitiva.get(i)+ "");
        }
        
        Collections.swap(primitiva, 0, 5);//a cambiado el de inidce 0 por el indice 5
    }
}
