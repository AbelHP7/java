/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.resuelta.pkg7.pkg1.pag.pkg215;

/**
 *
 * @author usuario
 */
public class CuentaCorriente {
    String dni,nombre;
    double saldo;
    CuentaCorriente(String dni,String nombre){
        this.dni=dni;
        this.nombre=nombre;
        saldo=0;
        
        
    }
  boolean SacarDinero(double cant)
    {
        boolean Posible;
        if(saldo>=cant)
        {
            saldo=saldo-cant;
            Posible=true;
        }
        else
        {
            System.out.println("No tienes saldo en la cuenta");
            Posible=false;
        }
     return Posible;
    }  
  void ingreso(double cant)
  {
  saldo+=cant;    
  }
  void mostrarTuInformación()
  {
      System.out.println("----------------");
      System.out.println("| Nombre: "+nombre);
      System.out.println("----------------");
      System.out.println("| Dni: "+dni);
      System.out.println("---------------------");
      System.out.println("| Saldo: "+saldo+" Euros");
      System.out.println("---------------------");
  }
  void comparar()
  {
      
  }
}

