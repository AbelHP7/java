/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa.examen241115;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class AaExamen241115 {

    /**
     * @param args the command line arguments
     */
    public static  String resultado(String resultado[])
    {
        String completo="";
        int distancia=3;
        for(int i=0;i<resultado.length;i++)
        {
             if(resultado[i].length()>distancia)
        {
            completo+=resultado[i];
        }
        }
        

      
        return completo;
    }
    public static void main(String[] args) {
        //declaracion de variables
        int longitud ;
        Scanner sc=new Scanner(System.in);
        boolean esta;
        esta = false;
        String palabra;
        String resultado[] = new String[0];
        boolean iguales;
        
        System.out.println("introduce las palabras que quieres dentro");
        palabra=sc.nextLine();
        int contador=0;
        
     
        
        while(palabra.equalsIgnoreCase("fin")==false ){
            
         
            resultado = Arrays.copyOf(resultado,resultado.length + 1);
            resultado[resultado.length - 1] = palabra;
            System.out.println(Arrays.toString(resultado));
            System.out.println("introduce las palabras que quieres dentro");
            palabra=sc.nextLine();
        }
        
        System.out.println(Arrays.toString(resultado));
        resultado(resultado);
        String completo=resultado(resultado);
        System.out.println(completo);
        
        

    }
}
