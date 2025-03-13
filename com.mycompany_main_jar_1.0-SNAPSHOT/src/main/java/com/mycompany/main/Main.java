/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
       Persona p=new Persona("abel","777689133W",1975);
       Empleado e=new Empleado("abel","777689133W",2006,"superior",1000);
       
       //lo hacemos con Colection y podemos ver que si va modificando en base o que haces eso es malo a la hora de cuando llegas a equivocarte
       Collection<Persona>pe;
       pe=new ArrayList<>();
       Persona p1=new Persona("","",33);
       pe.add(p1);
       p1.setNombre("pepe");
       System.out.println(pe.toString());
       
       
       //aqui se hace para que si te equivocas poder volver atras y que no se vaya modificando
       List<Persona>pe2;
       pe2=new ArrayList<>();
       Persona p2=new Persona("","",33);
       pe.add(new Persona("","",33));
       Persona temp=pe2.get(0);
       temp.setNombre("pepe");
       System.out.println(pe.toString());
       
       
       
       
       
        
    
       System.out.println(e.getAño());
       
        System.out.println(p.getAño());
    }
    public void Comparar(){
        
    }
}
