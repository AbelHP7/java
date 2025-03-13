/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciohora;

/**
 *
 * @author usuario
 */
public class HoraExacta extends Hora{
    private int segundos;

    public HoraExacta(int hora, int segundos, int minuto) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public boolean setSegundos(int segundos) {
        boolean valido=false;
        if(segundos>=0 && segundos<=59){
            this.segundos=segundos;
            valido=true;
        }
        return valido;
    }

    public int getSegundos() {
        return segundos;
    }
public void inc(){
    segundos++;
    if(segundos>59)
    {
        segundos=0;
    super.inc();
    }
}    

    @Override
    public String toString() {
        String temp=super.toString();
        temp=temp + ":"+segundos;
        return temp;
    }
    
}
