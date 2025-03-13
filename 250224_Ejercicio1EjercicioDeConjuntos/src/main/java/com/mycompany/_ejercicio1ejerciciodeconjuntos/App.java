/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio1ejerciciodeconjuntos;

import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        TreeSet<String>conjunto=new TreeSet<>();
        conjunto.add("Paco");
        conjunto.add("Juan");
        conjunto.add("Manolo");
        conjunto.add("Abel");
        conjunto.add("Paco");
        System.out.println(conjunto.toString());
    }
}
