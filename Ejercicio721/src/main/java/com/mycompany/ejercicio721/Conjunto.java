/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio721;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Conjunto {
    private Integer[]elementos;
    Conjunto()
    {
        elementos=new Integer[0];
    }
    int numeroElementos()
    {
    int tamaño=elementos.length;
    return tamaño;
    }
    public boolean pertenece(Integer elemento)
    {
        
        boolean pertenece=false;
        for(int i=0;i<elementos.length;i++)
        {
            if(elementos[i]==elemento)
            {
                pertenece=true;
            }
        }         
        return pertenece;
    }
    public void muestra()
    {
        System.out.println(elementos.toString());
        System.out.println("");
    }
    public boolean insertar(Integer nuevo)
    {
        boolean valido=true;
        if(pertenece(nuevo)==true)
        {
            valido=false;
        }
        else
        {
        elementos=Arrays.copyOf(elementos,elementos.length+1);
        elementos[elementos.length-1]=nuevo;
        }
        return valido;
    }
   public boolean insertar(Conjunto otro)
    {
        boolean insertar=true;
        for(int i=0;i<otro.elementos.length;i++)
        {
            if(insertar(otro.elementos[i])==false)
            {
                insertar=false;
            }
        }         
        return insertar;
    }
   /*
   public boolean eliminar(Integer elemento)
    {
        boolean eliminar=true;
        Integer indiceBorrado;
        if(indiceBorrado!=-1)
        {
            elemento[indiceBorrado]=elemento[elemento.]
        }
        return eliminar;
    }*/
   public boolean eliminar(Conjunto otro)
    {
        boolean eliminarC=true;
        return eliminarC;
    }
   static boolean incluido(Conjunto c1,Conjunto c2){
        boolean incluido=true;
        for(int i=0;i<c1.elementos.length;i++)
        {
            if(c2.pertenece(c1.elementos[i]))
            {
                incluido=true;
            }
        }
        return incluido;
    }
   
   public boolean insertarP(Integer nuevo)
    {
        boolean valido=true;
        if(pertenece(nuevo)==true)
        {
            valido=false;
        }
        else
        {
            
        elementos=Arrays.copyOf(elementos,elementos.length+1);
        elementos[elementos.length-1]=nuevo;
        }
        return valido;
    }
}
