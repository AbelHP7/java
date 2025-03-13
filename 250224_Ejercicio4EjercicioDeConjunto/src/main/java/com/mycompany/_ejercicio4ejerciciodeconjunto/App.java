/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio4ejerciciodeconjunto;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        LinkedHashSet<String>conjunto=new LinkedHashSet<>();
        
        Scanner sc=new Scanner(System.in);
        String palabra;
        do
        {
            System.out.println("Escribeme tus cosas favoritas");
            palabra=sc.nextLine();
            conjunto.add(palabra);
        }while(conjunto.size()<=10);
        System.out.println(conjunto.toString());
        
    }
}
