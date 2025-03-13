/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio721;

/**
 *
 * @author usuario
 */
public class Ejercicio721 {

    public static void main(String[] args) {
       Conjunto c;
       c = new Conjunto();
       c.insertar(7);
       Conjunto c2;
       c2=new Conjunto();
       c2.insertar(19);
       c2.insertar(20);
       c2.insertar(7);
       c.insertar(c2);
       c.muestra();
       
       Conjunto p;
       p = new Conjunto();
       do
       {
           int alea=(int)(Math.random()*49+1);
           p.insertar(alea);
       }while(p.numeroElementos()<6);
       c.muestra();
           
       
    }
}
