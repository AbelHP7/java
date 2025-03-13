/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio7relacionesdeejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args)
    {  
    Scanner sc=new Scanner(System.in);
        int m,n,q;
        clase c=new clase();
        System.out.println("Elige un valor para n");
        n=sc.nextInt();
        System.out.println("Elige un valor para m");
        m=sc.nextInt();
        System.out.println("Elige un valor para q");
        q=sc.nextInt();
        
    ArrayList<ArrayList<Integer>>matriz1=c.crearMatriz(n, m);
    ArrayList<ArrayList<Integer>>matriz2=c.crearMatriz(m, q);
 
    ArrayList<ArrayList<Integer>> resul= c.multiplicaciónMatrices(matriz1, matriz2);

    
    
    System.out.println("Esta es la matriz1:"+matriz1);
    System.out.println("Esta es la matriz2:"+matriz2);
    System.out.println("Esta es la matriz resultante:"+resul);
    
    
    


        
    
        
    
   
    }
    }
