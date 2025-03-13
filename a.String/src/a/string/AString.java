/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.string;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class AString {

//     public static void mostrarunoauno(String cad)
////     {
//         int longitud = cad.length
//     }
    
//        String a;
//        int longi;
//        int i=0;
//        
//       Scanner sc= new Scanner(System.in);
//      System.out.println("introduce la palabra");
//      
//       a=sc.next();
//       longi= a.length();
//       for(i=0;i<a.length();i++)
//       {
//           System.out.println(a.charAt(i));
//       }
//    
       
       
       
public static void unoauno(String cad)
{
    
    for(int i=0;i<cad.length();i++)
    {
        char caracter=cad.charAt(i);
        if(i%2==0)
        {
             System.out.print(Character.toUpperCase(caracter) + " ");
        }
        else
        {
             System.out.print(Character.toLowerCase(caracter) + " ");
        }
    }
}
    public static void main(String[] args) {
       String cad;
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce la palabra");
        cad=sc.next();
        unoauno(cad);
    }
}
            
               
                
                    
                
        
       