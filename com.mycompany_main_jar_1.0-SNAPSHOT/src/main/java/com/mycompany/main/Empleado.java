/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona  implements Comparable {
    private String cargo;
    private int sueldo;
    int años=0;
    public Empleado(String nombre,String dni,int año,String cargo,int sueldo){
        super(nombre,dni,año);
         this.cargo = cargo;
        this.sueldo = sueldo;
    }
    public int compareTo(Object otro){
        Empleado e=(Empleado)otro;
        int resul=e.sueldo-this.sueldo;
        return resul;
    }
   
    
}
