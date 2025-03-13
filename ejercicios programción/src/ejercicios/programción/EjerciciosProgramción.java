/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.programción;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciosProgramción {
//4.14
    //public static  long tiempo(long d,long h,long m){
//    long segundos=0;
//    d=d*86400;
//    h=h*3600;
//    m=m*60;
//    segundos=d+h+m;
//   
//    
//    return segundos;
    //4.18
public static  void alea(int n1,int n2,int cant){
   
for(i=0;i<5;i++)
{
    Math.random(cant)
}
} 
   
    public static void main(String[] args) {
//        long d,h,m,tiempo;
//        
//        Scanner sc=new Scanner(System.in);
//        System.out.println("introduce los dias ");
//        d=sc.nextLong();
//        System.out.println("introduce las horas ");
//        h=sc.nextLong();
//        System.out.println("introduce los minutos");
//        m=sc.nextLong();
//        System.out.println( tiempo( d,h, m));


int n1,n2;
Scanner sc=new Scanner(System.in);
     System.out.println("introduce el primer numero ");
       n1=sc.nextInt();
       System.out.println("introduce segundo numero ");
       n2=sc.nextInt();
    
      System.out.println( alea( n1,n2, cant));
    }
    
}
