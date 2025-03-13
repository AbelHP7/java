package objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Coordenada {
     /**
     * @param args the command line arguments
     */
    //ESTADO: atributos de la clase
   private int fila;
   private int col;
   
   //INTERFAZ: métodos de la clase
   public Coordenada()
   //constructor vacío
   {
   }
   
   public Coordenada(int f, int c)
   {
       //fila=f;
       //col=c;
       setValores(f,c);
   }
   
   public int getFila()
   {
       return fila;
   }
   
   public int getCol()
   {
       return col;
   }
   
   public void setFila(int f)
   {
       fila = f;
   }
   
   public void setCol(int c)
   {
       col = c;
   }
   
   public void setValores(int f, int c)
   {
       fila=f;
       col=c;
   }
   
   public void mostrar()
   {
        System.out.println("-------INFO------");
        System.out.println("OBJETO COORDENADA");
        System.out.println("Fila: " + fila);
        System.out.println("Col : " + col);
        System.out.println("-----------------");    
   }
   
   public boolean comparar(Coordenada otra)
   //método para comparar si la fila y la columna
   // de dos objetos son las mismas
   //otra-> da acceso a un objeto Coordenada con el que comparar
   //this-> da acceso al objeto que recibe la llamada al método
   {
       boolean resul;
       
       if( (this.fila == otra.fila) && (this.col == otra.col) )
       {
           resul = true;
       }
       else
       {
           resul = false;
       }
       
       return resul;
   }
}
