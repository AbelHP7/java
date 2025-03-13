/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio6relacionesdeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

public static void main(String[] args) 
{
        ArrayList<Integer>lista=new ArrayList<>();
        ArrayList<Integer>listaprimos=new ArrayList<>();
        
        int n=(int)(Math.random()*49)+1;
        System.out.println("El numero aleatorio va ser:"+n);
     
        
        for (int i = 2; i <= n; i++) { 
            if (esPrimo(i)==true)
            {
                listaprimos.add(i);
            }
        }      
        System.out.println("Números primos hasta " + n + ": " + listaprimos);
    }      

 public static boolean esPrimo(int n) {
     boolean esprimo=true;
        if (n<=2) 
        {
             esprimo=true;
        }
        for (int i = 2; i < n; i++) { 
            if (n% i == 0) {
                esprimo=false;
            }
        }
        return esprimo;
    }
}