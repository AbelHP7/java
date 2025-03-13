/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericio913.de.la.pagina299;

import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class main {
     public static void main(String[] args) {
     Futbolista[]tablas=new Futbolista[3];
         
     tablas[0]=new Futbolista("77789897W","alfredo",18,120);
     tablas[1]=new Futbolista("77789877M","Paco",35,70);
     tablas[2]=new Futbolista("12555897R","manolo",28,100);
     tablas[3]=new Futbolista("78789897E","cristian",23,170);
     tablas[4]=new Futbolista("99789877T","Abel",19,770);
     
     
     
     Arrays.sort(tablas);
     System.out.println(Arrays.toString(tablas));
        
     }
}
