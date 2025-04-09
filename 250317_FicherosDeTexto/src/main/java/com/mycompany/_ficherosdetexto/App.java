/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ficherosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
BufferedWriter out = null;
        try 
        {
            out = new BufferedWriter(new FileWriter("C:\\Users\\usuario\\Desktop\\quijote.txt"));
            String cad = "En un lugar de la mancha,"; //primera línea
            for (int i = 0; i < cad.length(); i++) 
            {
                out.write(cad.charAt(i)); //escribimos carácter a carácter
            }

            cad = "de cuyo nombre no quiero acordarme."; //segunda línea
            out.newLine(); //cambio de línea en el archivo
            out.write(cad); //escribimos con una única sentencia
            
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        } 
        finally 
        {
            if (out != null) 
            {
                try 
                {
                    out.close(); /*hacemos que se vacíe el búfer y se escriba en el archivo*/
                } 
                catch (IOException ex) 
                {
                    System.out.println(ex);
                }
            }

        }
    }
}