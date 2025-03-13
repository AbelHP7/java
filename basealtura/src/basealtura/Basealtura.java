/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basealtura;

/**
 *
 * @author usuario
 */

         //crear dos funciones sobrecargadas para calcular el área de un cuadrado y de un rectángulo
        double areac;
        areac= Math.pow(ladoc,2);  
        return areac;
    }
    public static double area (double ladoM,double ladom)
    {
        double arear;
        arear=ladoM*ladom;
        return arear;
    }
    public static void main(String[] args) {
        //4.14
        double ladoc,ladoM,ladom;
          Scanner  sc = new Scanner(System.in);
         
          System.out.println("introduce la cantidad de cm del lado del cuadrado: ");
        ladoc=sc.nextInt();
        System.out.println (area ( ladoc));
        System.out.println("introduce la cantidad de cm del lado mayor de tu rectangulo: ");
       ladoM=sc.nextInt();
        System.out.println("introduce la cantidad de cm del lado menor de tu rectangulo: ");
      ladom=sc.nextInt();
     System.out.println (area ( ladoM, ladom));
       
     
       
    }
}
