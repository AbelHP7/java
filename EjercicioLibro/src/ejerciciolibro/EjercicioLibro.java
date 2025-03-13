/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolibro;

/**
 *
 * @author usuario
 */
public class EjercicioLibro {

    public static void numeroAlea(int cantidad,int min,int max)
    {
        int numero=0;
        if(cantidad<=0)
        {
            System.out.println("la cantidad debe ser mayor que cero");
        }
        else
        {
            if(min>=max)
            {
                System.out.println("el valor minimo debe ser menor que el maximo");
            }
            else
            {
                for(int i=1;i<=cantidad;i++)
                {
                    numero=(int)(Math.random() * (max-min))+min;
                    System.out.println("numero"+numero);
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
