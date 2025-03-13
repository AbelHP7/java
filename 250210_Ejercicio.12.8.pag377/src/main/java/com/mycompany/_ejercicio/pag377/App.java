/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio.pag377;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
      ArrayList<Integer>Lista=new ArrayList<>();
        do
        {
            Lista.add((int)(Math.random()*50)+1);
        }while(Lista.size()<20);
        
        System.out.println(Lista.toString());
        
        
        
        Collections.sort(Lista);
        System.out.println(Lista.toString());
        
        Integer[]tabla= Lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
        
        ArrayList<Integer>OtraLista= new ArrayList<>();
        OtraLista.addAll(Arrays.asList(tabla));
        System.out.println(OtraLista);
      
        }
}
