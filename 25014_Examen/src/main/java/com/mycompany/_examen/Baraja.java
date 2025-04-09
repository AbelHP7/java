/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._examen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Baraja {
 ArrayList<Carta>baraja=new ArrayList<>();
 
    public Baraja()
    {
            for(int i=1;i<=12;i++)
            {
                //array con los palos
                String[]alea={"oro","bastos","Espadas","Copas"};
                for(int j=0;j<=alea.length;j++)
                {
                 Carta c=new Carta(j,alea[j]);
                 baraja.add(c);
                }
            }      
    }
    public Baraja(Carta[]iniciales) 
    {
         baraja.addAll(Arrays.asList(iniciales));
    }
    public Baraja(Collection<Carta>iniciales) 
    { 
        //Recorremos la baraja con un iterator
       Iterator<Carta> itr = baraja.iterator();
        while(itr.hasNext())
        {
            // Obtenemos la entrada actual 
            Carta pareja = itr.next();
        }
        {
        baraja.addAll(iniciales);
    }
    }
    public void robar()
    {
        System.out.println("Roba una carta");
        baraja.get(0);
        baraja.remove(0);
    }
    public void mezclar()
    {
        HashSet<Carta>NuevaBaraja=new HashSet<>();
        
    }
    public void barajar()
    {
        
    }
    public boolean vacia()
    {   
        //variable para ver si esta vacia o llena y hacemos el metodo contains para saber si esta vacia
        boolean lleno=true;
        //Creamos una lista vacia
        ArrayList<Carta>vacia=new ArrayList<>();
        if(!baraja.containsAll(vacia))
        {
            lleno=true;
        }
        return lleno;
    }

    
     

    

    

    
    
    
    
    
}
