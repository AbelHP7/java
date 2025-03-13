/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.leernombreapellidos;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ALeernombreapellidos {

    public static String nombreapellidos(String nombre,String apellido1,String apellido2)
    {
        String todojunto= nombre+apellido1+apellido2;
             return todojunto;
    }
    public static void main(String[] args) {
        String nombre;
        String apellido1;
        String apellido2;
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el nombre");
        nombre=sc.nextLine();
        System.out.println("introduce el 1 apellido");
         apellido1=sc.nextLine();
         System.out.println("introduce el 2 apellido");
          apellido2=sc.nextLine();
          
          nombreapellidos(nombre,apellido1,apellido2);
    }
    
}
