package com.mycompany.puntodedatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Puntodedatos {

    public static void main(String[] args) {
        System.out.println("punto de datos");
        int KK;
        double numero, mesa =3;
        
       Scanner leer=new Scanner(System.in);
       System.out.println("introduce un real");
       numero = leer.nextDouble();
       System.out.println("el numero que has metido es:"+numero);
       mesa= mesa+numero;
       System.out.println(mesa);
System.out.println(numero*2);
System.out.println(numero*3);
System.out.println(numero*4);
System.out.println(numero*5);
System.out.println(numero*6);
System.out.println(numero*7);
System.out.println(numero*8);
System.out.println(numero*9);
System.out.println(numero*10);
System.out.println("introduce otro numero");
KK=leer.nextInt();
System.out.println(numero*KK);


    }
}




       
       
       
       
       
     
    

