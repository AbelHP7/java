/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a.entornosherencia;

/**
 *
 * @author usuario
 */
public class AEntornosHerencia {

    public static void main(String[] args) {
        Automovil auto=new Automovil("AVH-666","Rojo","peugeot",5);
        auto.ModoManejo();
        auto.Acelerar();
        auto.CambiarDeVelocidad();
        auto.Frenar();
    }
}
