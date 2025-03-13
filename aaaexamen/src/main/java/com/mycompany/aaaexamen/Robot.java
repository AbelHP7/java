/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aaaexamen;

/**
 *
 * @author usuario
 */
public class Robot {
   private String nombre;
   private double cargamaxima;
   private double cargaactual;
   public int añof;
   private int distancia;
   public Robot()
   {
       
   }
   public Robot(String nombre,double cargamaxima,double cargaactual,int añof,double distancia){
       
   }
   public Robot(String nombre){
       
   }
   public void mostrar()
   {
       
   }
   public double mover(double distancia)
   {
       
       distancia=(1.1-(cargaactual/cargamaxima))*10;
       return distancia;
   }
   public void setCargaactual(double alea2){
       cargaactual=alea2;
   }
    public double getCargaactual(){
       return cargaactual;
   }
public boolean comprobarAño(){
    boolean mayor;
       if(añof>2002)
       {
           mayor=true;
       }
       else
       {
           mayor=false;
       }
       return mayor;
    
}

}

   

