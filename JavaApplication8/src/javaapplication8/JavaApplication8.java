package javaapplication8;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //realizar un prtograma que pida un numero(entre el 1 y 20) por teclado
        int n ;
        double alea;
        int nalea;
        int n2alea;
        int intervalo=0;
        int numero;
         Scanner sc= new Scanner(System.in);
         int rango= 20-1;
   
        do
        {
         System.out.println("introduce un numero del 1 al 20");
         n = sc.nextInt();
         System.out.print (n);
         System.out.print("  ");
        
  
    do
    {
    alea= Math.random();
    
   
           
    nalea= (int)(alea* n);
    nalea = (int)((alea*rango)+1); 
    System.out.println(nalea);
    
   
     
       do
    {
        System.out.println("introduce el numero");
         numero = sc.nextInt();
        if(numero<=9 || numero >=0)
        {
       System.out.println(numero);
       numero+= intervalo;
        }
    }while(numero<=100);
          }while(n<=nalea);
     
               
           
           

           
     
      
     
         
     
    
         
        }while(n<=nalea);
    }
    
}
