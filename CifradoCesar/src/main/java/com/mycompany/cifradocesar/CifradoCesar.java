package com.mycompany.cifradocesar;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CifradoCesar {
   
    public static void main(String[] args)
    {
        String m;  // Mensaje del usuario
        int n;     // Número de desplazamiento
        Cesar c;   // Objeto de la clase Cesar

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la palabra que quieres mandar cifrada:");
        m = sc.nextLine();
        System.out.println("Introduce con ello el número que quieres utilizar:");
        n = sc.nextInt();

        c = new Cesar(m, n); // Crear el objeto con los valores ingresados
        c.cifrar();          // Llamar al método para cifrar el mensaje    
    }
}
    /*
         public static void main(String[] args)
    {
        String m;  // Mensaje del usuario
        int n;     // Número de desplazamiento
        Cesar c;   // Objeto de la clase Cesar

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la palabra que quieres mandar cifrada:");
        m = sc.nextLine();
        System.out.println("Introduce con ello el número que quieres utilizar:");
        n = sc.nextInt();

        c = new Cesar(m, n); // Crear el objeto con los valores ingresados
        c.cifrar();          // Llamar al método para cifrar el mensaje    
    }
}
*/