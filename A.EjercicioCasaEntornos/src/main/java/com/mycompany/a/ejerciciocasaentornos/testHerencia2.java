/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciocasaentornos;

/**
 *
 * @author usuario
 */
public class testHerencia2 {

    public static void main(String[] args) {
        Producto P=new Producto(2008,801);
        ProductoCongelado C=new ProductoCongelado(600,2007,-7);
        ProductoFresco F=new ProductoFresco(700,2018,2015,"España");
        ProductoRefrigerado R=new ProductoRefrigerado(500,2025,56789);
       
        System.out.println("Mostramos producto="+P.toString());
        System.out.println("Mostramos Congelado="+C.toString());
        System.out.println("Mostramos fresco="+F.toString());
        System.out.println("Mostramos Refrigerado="+R.toString());
       
        //cambio la fecha de caducidad de producto
        P.setFechaDeCaducidad(2018);
        //cambio el numero de lote de el producto congelado
        C.setnDeLote(400);
        //cambio el pais de producto fresco
        F.setPais("mexico");
       
       
        System.out.println("");
        System.out.println("Valores cambiamos");
        System.out.println("Mostramos producto="+P.toString());
        System.out.println("Mostramos Congelado="+C.toString());
        System.out.println("Mostramos fresco="+F.toString());
        System.out.println("Mostramos Refrigerado="+R.toString());
       
       
    }
}

