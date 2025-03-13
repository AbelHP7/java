/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.ejerciciodeldestonillador;
//import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class AEjerciciodeldestonillador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       boolean salir;
//       int n=4;
//       String cad;
//       n=4;
//       
//       Scanner sc= new Scanner(System.in);
//       System.out.println("introduce la palabra");
//       cad=sc.nextLine();
//       
//       salir=false;
//       if(cad=="")
//       {
//           salir=true;
//       }
//        if(cad==(" "))
//       {
//           salir=true;
//       }
//       while(salir==false)
//       {
//           System.out.println(cad.substring(0,n));
//           cad=cad.substring(n,cad.length());
//           if(cad.length()<n)
//           {
//               System.out.println(cad);
//               salir=true;
//           }
//       }

String cad="En un lugar de la mancha";
cad=cad.toLowerCase();
//declaracion de variables
int espacio ;
String palabra;
char letra;
String palabranueva;
String resul;

while(cad.length()<0)
{
  espacio = cad.indexOf(' ');
 palabra= cad.substring(0,espacio);
  letra=palabra.charAt(0);
  letra=Character.toUpperCase(letra);
  palabranueva=letra+palabra.substring(1);
  resul = palabranueva;
  cad= resul;
  System.out.println(resul);
  
}





    }
    
}
