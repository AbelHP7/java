/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio4deejerciciosdemapas;

/**
 *
 * @author usuario
 */
public class App {

     public static void main(String[] args) {
        String palabra1 = "alacran";
        String palabra2 = "naracla";

        // Llamar al método sonAnagramas de la clase ComprobadorAnagramas
        if (comprobadorAnagramas.sonAnagramas(palabra1, palabra2)) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }
    }
}