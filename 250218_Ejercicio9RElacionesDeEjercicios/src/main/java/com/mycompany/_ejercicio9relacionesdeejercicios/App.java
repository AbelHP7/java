/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio9relacionesdeejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer>lista= new ArrayList<>();
        for(int i=0;i<=20;i++){
            lista.add(i);
        }
        
        Collections.reverse(lista);
        
        System.out.println(lista);
    }
}
