/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio331.pagina301;

/**
 *
 * @author usuario
 */
public class ComparatorTelefono {
    public int compare(Object ob1,Object ob2){
        Llamada l1=(Llamada)ob1;
        Llamada l2=(Llamada)ob2;
        if(l1.Telefono==l2.Telefono)
        {
            if(l1.hora==l2.hora)
            {
                return l1.fecha-l2.fecha;
            }
            else
            {
                return l1.hora-l2.hora;
            }
        }
        else
        {
            return l1.Telefono-l2.Telefono;
        }
            
       
    }
}
