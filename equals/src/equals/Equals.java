/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equals;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Equals {
     public static void iguales(String cad1,String cad2,String cad3)
     {
         // Comparación entre cadena1 y cadena2
         if(cad1.equals(cad2))
         {
             System.out.println("cadena 1 y cadena 2 son iguales");
         }
         else
         {
             System.out.println("cadena 1 y cadena 2 son diferentes");
         }
         // Comparación entre cadena1 y cadena3
          if(cad1.equals(cad3))
          {
              System.out.println("cadena 1 y cadena 3 son iguales");
          }
          else
          {
              System.out.println("cadena 1 y cadena 3 son diferentes");
          }
             }

    public static void main(String[] args) {
       
        String cad1;
        String cad2;
        String cad3;
      Scanner sc= new Scanner(System.in);
        System.out.println("introduce la cadena 1");
        cad1=sc.nextLine();
         System.out.println("introduce la cadena 2");
        cad2=sc.nextLine();
        System.out.println("introduce la cadena 3");
        cad3=sc.nextLine();
       
    iguales(cad1,cad2,cad3);
       
    }
}


         