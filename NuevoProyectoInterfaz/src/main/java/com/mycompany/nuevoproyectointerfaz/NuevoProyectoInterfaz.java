/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nuevoproyectointerfaz;

/**
 *
 * @author usuario
 */
public class NuevoProyectoInterfaz {

    public static void main(String[] args) {
        Perro pe=new Perro(0);
        Perro pepito=new Perro(2);
        pe.voz();
        Sonido s;
        s=pe;
        System.out.println(pe.nuevo());
        s.voz();
        System.out.println(pe.compareTo(pepito));
        Gato g=new Gato();
        
       
        
    }
}
