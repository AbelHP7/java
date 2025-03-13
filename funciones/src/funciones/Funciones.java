/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;
 
public class Funciones {

   public static int calculadora(int n1,int n2, char operador ){
       int resul=0;
      do{

//            if(operador != 's')
//            {
            
                switch(operador)
                {
                    case '+': resul = n1+n2;
                        break;
                    case '-': resul = n1-n2;
                        break;
                    case '*': resul = n1*n2;
                        break;
                    case '/': resul = n1/n2;
                        break;

                    default: System.out.println("Elige una opción válida");
                }
            
        }while(operador != 's');
      return resul;
//      int resul=0;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("numero a");
//         a = sc.nextInt();
//          System.out.println("numero b");
//          b = sc.nextInt();
//            if(a<b)
//            {
//                resul=-1;
//            }
//            if(a>b)
//            {
//                resul=1;
//            }
//          
//          System.out.println(resul);
//          return resul;
           
//           public static int media(int numero){
//             int media=0;
//             int contador=0 ;
//             int suma;
//            while(numero!=0)
//            {
//                
//             
//                 contador++;
//                 suma=+numero;
//                 media=(suma/contador);
//             }
////             if(n1!=0 || n2!=0)
////             {
////             media=(n1+n2)/2;
////             }
//            
//              return media;
   }
    public static void main(String[] args) {
        //        Mostrar un menú al usuario que le permita elegir qué operación
//        quiere realizar sobre dos números que también introducirá.
//        El programa para de pedir operandos y operadores cuando el usuario lo indique (introduciendo 's' por ejemplo).
       
        int n1, n2;
        double resul=0;
        char operador;
        String cadena;
        
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce la operación [+,-,/,*,s]");
            cadena = lectorTeclado.next();
            operador = cadena.charAt(0);
        
            
           
            
                System.out.println("Introduce el primer operando: ");
            
                n1 = lectorTeclado.nextInt();

                System.out.println("Introduce el segundo operando: ");
                n2 = lectorTeclado.nextInt();
                System.out.println(calculadora( n1, n2,operador));
                System.out.println(resul);
            

                  

        


//       double numero;
//       double media=0;
//       int contador=0 ;
//       double suma=0;
//       Scanner sc= new Scanner(System.in);
//       
//        
//       
//           do
//            {
//                System.out.println("introduce el numero:");
//            numero = sc.nextInt();
//             if(numero!=0)
//             {
//                 contador++;
//                 suma+=numero;
//                 media=suma/contador;
//              
//             }
//             else
//             {
//                 
//              System.out.println(media);
//             }
//             }   while(numero>=0);
//         
//             
//
//           
//        
    }
    }
    

