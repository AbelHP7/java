/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio715;

/**
 *
 * @author usuario
 */
public class Calendario {
    private int año;
    private int mes;
    private int dia;
    Calendario()
    {
        this.año=año;
        this.mes=mes;
        this.año=dia;
    }
    Calendario(int año,int mes,int dia)
    {
        comprobar(año,mes,dia);
        
    }
    private boolean comprobar(int año,int mes,int dia)
    {
        boolean valida=true;
        if(año>=0&&año<=2025||mes>=0&&mes<=12||dia>=0&&dia<=31)
        {
            
        }
        else
        {
           valida=false;
        }   
        return valida;
    }
    public void incrementarDia()
    {
        if(dia!=31)
        {
        dia++;
        }
        else
        {
            incrementarMes();
        }
        
    }
    public void incrementarMes()
    {
        int cantidad=año;
        if(mes!=12){
            mes++;
        }
        else
        {
            incrementarAño(cantidad);
        }
        
        
    }
    public void incrementarAño(int cantidad)
    {
         if(año!=2025){
            año++;
        }
    }
    public void mostrar()
    {
        System.out.println("Estamos en el año:"+año);
        System.out.println("Estamos en el mes:"+mes);
        System.out.println("Estamos en el dia:"+dia);
    }
    boolean iguales(Calendario otroFecha)
    {
        boolean iguales=true;
        return iguales;
    }
}
