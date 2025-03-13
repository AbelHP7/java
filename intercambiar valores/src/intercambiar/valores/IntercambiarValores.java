/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intercambiar.valores;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class IntercambiarValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de varaibles
        char tabla[]={'A','B'};
        char nueva[]=new char[2];
        char intercambiada[]=new char[2];
        
        
        //intercambio de letras
        for(int i=0;i<tabla.length;i++)
        {
           
            for(int j=0;j<tabla.length;j++)
            {
                 double alea=Math.random();
                  i=(int)(alea*2);
                nueva[j]=tabla[i];
            }
        }
        System.out.println(Arrays.toString(nueva));
        
    }
    
}
