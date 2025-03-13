/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.entornosherencia;

/**
 *
 * @author usuario
 */
public class Automovil extends Clase
{
 private int noPasajeros;
 public Automovil(String numPlaca,String color,String Modelo,int nPas)
 {
     super(numPlaca,color,Modelo);
     this.noPasajeros=nPas;
 }
 public void ModoManejo(){
     System.out.println("Auto en modo de Manejo: Sport");
 }
}
