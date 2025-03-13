/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg111124;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Main {

     public static void mezclar(int array1,int array2)
     {
         
     }
    public static void main(String[] args) {
        //Generar dos arrays de enteros de tamaño aleatorio (entre 0 y 10 inclusive).
        //declaración de variables
        double alea;
        int[]array1;
        int[]array2;
        int longitud1;
        int longitud2;
        int rango=10;
        int rango2=100;
        int numero;
        int cf=0;
        int c1=0;
        int c2=0;
           
        
       
        
        
        alea= Math.random();// valor en el rango (0,1)
        longitud1= (int)(alea* 10);
        longitud1 = (int)((alea*rango)+1);
        array1 =new int[longitud1];
        
        alea= Math.random();// valor en el rango (0,1)
        numero= (int)(alea* 100);
        numero = (int)((alea*rango2)+1);
        
        for(int i=0;i<longitud1;i++)
        {
            alea= Math.random();// valor en el rango (0,1)
             numero= (int)(alea* 100);
             numero = (int)((alea*rango2)+1);
            array1[i]=numero;
           
            
        }
       System.out.println(Arrays.toString(array1));
        
        alea= Math.random();// valor en el rango (0,1)
        longitud2= (int)(alea* 10);
        longitud2 = (int)((alea*rango)+1);
        array2 =new int[longitud2];
        
        alea= Math.random();// valor en el rango (0,1)
        numero= (int)(alea* 100);
        numero = (int)((alea*rango2)+1);
        
        for(int i=0;i<longitud2;i++)
        {
            alea= Math.random();// valor en el rango (0,1)
             numero= (int)(alea* 100);
             numero = (int)((alea*rango2)+1);
            array2[i]=numero;
           
            
        }
       System.out.println(Arrays.toString(array2));
       int[]mezcla;
       mezcla = new int[array1.length+array2.length]; 
      
       while(cf<mezcla.length)
       {
       //array1
            if(c1<array1.length)
            {
                mezcla[cf]=array1[c1];
                cf++;
                c1++;
            }
        //array2
            if(c2<array2.length)
            {
                mezcla[cf]=array2[c2];
                cf++;
                c2++;
            }
       }    
        System.out.println(Arrays.toString(mezcla));
    
    }
}
