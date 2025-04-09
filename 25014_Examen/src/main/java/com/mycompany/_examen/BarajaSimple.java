/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._examen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class BarajaSimple extends Baraja
{    
    public BarajaSimple() 
    {
      super();
       
       Iterator<Carta> itr = baraja.iterator();
        while(itr.hasNext())
        {
            // Obtenemos la entrada actual 
            Carta pareja = itr.next();
            // Si el valor es 8,9 se elimina
            if (pareja.equals(9)) 
            {
                itr.remove();
            }
            if (pareja.equals(8)) 
            {
                itr.remove();
            }
        }
    }
    public BarajaSimple(Carta[] iniciales) 
    {
        super(iniciales);
    }

    public BarajaSimple(Collection<Carta> iniciales) 
    {
        super(iniciales);
    }

    
    
    
}
