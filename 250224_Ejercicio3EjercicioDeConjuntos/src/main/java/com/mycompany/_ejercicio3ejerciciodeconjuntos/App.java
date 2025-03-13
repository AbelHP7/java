/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio3ejerciciodeconjuntos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class App 
{

    public static void main(String[] args) 
    {

        TreeSet<Integer>conjunto=new TreeSet<>();
        ArrayList<String>resul=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int iteraciones;
        String opcion;
        int x;
        iteraciones=sc.nextInt();

        for(int i=0;i<iteraciones;i++)
        {
            opcion=sc2.nextLine();
            resul.add(opcion);

            
        }
        for(String s:resul){
                System.out.println(s);
        }

    
    


/*
    switch (opcion)
           {
                case 1:
                    conjunto.add(x);
                    break;
                case 2:
                    conjunto.remove(x);
                    break;
                case 3:
                     if (conjunto.contains(x)==true) 
                     { 
                     resul.add("Yes"); 
                     } 
                     else 
                     {
                     resul.add("No");  
                     }
                     break;
            }*/
    }
}


