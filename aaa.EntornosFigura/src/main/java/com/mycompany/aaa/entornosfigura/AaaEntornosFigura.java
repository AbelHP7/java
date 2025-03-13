/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aaa.entornosfigura;

/**
 *
 * @author usuario
 */
public class AaaEntornosFigura {

   

    public static void main(String[] args) {
        Cuadrado c=new Cuadrado("azul",4,4,5);//calculamos el lado con el valor predeterminado 
        System.out.println(c.calcularArea());
        c.setlado(6);//cambiamos el lado a 6 
        System.out.println(c.calcularArea());
        
        rectangulo r=new rectangulo("blanco",7,7);
        System.out.println(r.CalcularArea());//calculamos el area del rectangulo
        
        Figura f=new Figura("yelow");
        System.out.println(f.MostrarColor());
    }
}
