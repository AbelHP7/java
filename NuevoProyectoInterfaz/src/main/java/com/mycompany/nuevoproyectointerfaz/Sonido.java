/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.nuevoproyectointerfaz;

/**
 *
 * @author usuario
 */
public interface Sonido {
 public void voz();
 default int nuevo(){
     return 3;
 }
 static int real(){
     return 0;
 }
    

}
