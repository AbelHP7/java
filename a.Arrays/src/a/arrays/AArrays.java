/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.arrays;

/**
 *
 * @author usuario
 */
public class AArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int []combi;
       combi=new int [6];
       boolean estar =false;
        int cont=0;
       for(int i=0;i<6;i++)
       {
           combi[i]=-1;      
       }
        while(cont<6)
           {
                cont++;
               int numeroaleatorio = (int) (Math.random() * 49) + 1; //numero entre 1-49
               System.out.println(numeroaleatorio);
               for(int i=0;i<6;i++)
               {
                   //combi[i]=numeroaleatorio;
                   if(numeroaleatorio!=combi[i])
                   {
                        estar=false;
                        //cont++;
                   }    
               }
              if(estar=false)
                    {
                        combi[cont]=numeroaleatorio;
                        cont++;

                    }
           }
           
       
    }  
}
