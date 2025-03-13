/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a.ejerciciohora;

/**
 *
 * @author usuario
 */
public class AEjercicioHora {

    public static void main(String[] args) {
        Hora H=new Hora(3,59);
        HoraExacta E=new HoraExacta(3,59,59);
        
        System.out.println("la hora es:"+H.hora);
        System.out.println("la hora es:"+E.getHora());
        System.out.println(H.toString());
        System.out.println(E.toString());
        
        Hora c=new Hora(3,59);
        c=null;
    }
}
