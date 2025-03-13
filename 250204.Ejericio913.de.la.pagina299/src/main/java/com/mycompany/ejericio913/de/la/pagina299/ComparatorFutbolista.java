/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericio913.de.la.pagina299;

/**
 *
 * @author usuario
 */
public class ComparatorFutbolista {
    public int compare(Object ob1,Object ob2)
    {
        Futbolista f1=(Futbolista)ob1;
        Futbolista f2=(Futbolista)ob2;
        if(f1.edad==f2.edad)
        {
           return f1.nombre.compareTo(f2.nombre);
        }
        else
        {
            return f1.edad-f2.edad;
        }
    }
}
