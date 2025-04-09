/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicioficherosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        Config c=new Config("C:\\Users\\usuario\\Desktop\\nuevo_Archivo.txt");
        c.add("juan", "7");
        c.add("paco", "29");
        c.add("paco", "9");
        c.delete("juan");
        c.consultar("paco");
        c.leer("C:\\Users\\usuario\\Desktop\\quijote.txt");
        c.guardar();
    }
}
