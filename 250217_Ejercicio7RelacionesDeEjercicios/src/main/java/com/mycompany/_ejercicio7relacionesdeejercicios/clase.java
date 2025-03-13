/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio7relacionesdeejercicios;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class clase {

    public clase() 
    {
        
    }
public ArrayList<ArrayList<Integer>> multiplicaciónMatrices(ArrayList<ArrayList<Integer>> matriz1,ArrayList<ArrayList<Integer>> matriz2)
{
        int filas1 = matriz1.size();
        int columnas1 = matriz1.get(0).size();
        int columnas2 = matriz2.get(0).size();

        // Crear matriz resultado con ceros
        ArrayList<ArrayList<Integer>> resul = new ArrayList<>();
        for (int i = 0; i < filas1; i++)
        {
            resul.add(new ArrayList<>());
            for (int j = 0; j < columnas2; j++) 
            {
                resul.get(i).add(0);
            }
        }

        // Multiplicación de matrices
        for (int i = 0; i < filas1; i++) 
        {
            for (int j = 0; j < columnas2; j++)
            {
                int suma = 0;
                for (int p = 0; p < columnas1; p++) 
                {
                    suma += matriz1.get(i).get(p) * matriz2.get(p).get(j);
                }
                resul.get(i).set(j, suma);
            }
        }

        return resul;
}
public ArrayList<ArrayList<Integer>> crearMatriz(int filas, int columnas) 
    {
      ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

    for (int i = 0; i < filas; i++) 
    {
        ArrayList<Integer> fila = new ArrayList<>();
        for (int j = 0; j < columnas; j++) 
        {
            fila.add((int)(Math.random()*19)+1);
        }
        matriz.add(fila);
    }

      return matriz;
    }

    

    
}
