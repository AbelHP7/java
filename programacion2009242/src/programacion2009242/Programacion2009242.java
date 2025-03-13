package programacion2009242;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;



/**
 *
 * @author usuario
 */
public class Programacion2009242 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1, numero2, resul;
        //definimos un scanner
        //asignar un valor al scanner
        
        System.out.println("introduce un numero entero:");
        numero1 = leer.nextInt();
        
        System.out.println("introduce otro numero entero:");
        numero2= leer.nextInt();
        resul = numero1+numero2 ;
        
        System.out.println(resul);
        
        
        
        // TODO code application logic here
    }
    
}
