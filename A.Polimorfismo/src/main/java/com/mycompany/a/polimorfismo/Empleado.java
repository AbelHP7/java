/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.polimorfismo;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona{
    public double salario=1795;
    public String estatura="XL";
    public Empleado(String nombre,int edad,double estatura,double salario,String estatura){
        super(nombre,edad,estatura);
        this.salario=salario;
        this.estatura=estatura;
        
    }
    public void mostrarDatos(){
        
    }
}
