/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

/**
 *
 * @author usuario
 */
public class Vectores {
  //Metodo principal para peobar la sobrecarga
    public static void main(String[] args) {

    
            
            Vector2D v1=new Vector2D(3,4);
            Vector2D v2=new Vector2D(1,2);
            
            Vector2D suma=v1.add(v2);
            Vector2D resta=v1.subtract(v2);
            
            System.out.println("vECTOR 1:"+v1);
            System.out.println("vECTOR 2:"+v2);
            System.out.println("suma:"+suma);
            System.out.println("resta:"+resta);




            
    }
}