/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.todoslosejercicios.arrays;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class ATODOSLOSEJERCICIOSARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
          //EJERCICIO 5.3 PAG 137
   
   
   
// public static void desodernar(int tabla[]){
//        Scanner sc =new Scanner(System.in);
//        for(int i=tabla.length-1;i>=0;i--)
//           {
//               System.out.println("Introduce los numeros que quieres dentro");
//               int numeros=sc.nextInt();
//               tabla[i] = numeros;
//           }
//    }
//    
// public static void main(String[] args) {
//    
//    
//     System.out.println("introduce el numero de espacios que quieres que tenga tu arrays");
//     Scanner sc =new Scanner(System.in);
//     int longitud=sc.nextInt();
//     int tabla[]=new int[longitud];
//  
//    
//     System.out.println(Arrays.toString(tabla));
//           desodernar( tabla);
//     System.out.println(Arrays.toString(tabla));
// }
// }

   
   
       //EJERCICIO 5.4 PAG 138
   
   
   
//    public static int maximo(int tabla[])
//    {
//        int maximo;
//        Arrays.sort(tabla);
//      
//        maximo=  tabla[tabla.length-1];
//        return maximo;
//    }
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    
//    System.out.println("introduce la longitud que quieres que tenga tu array");
//    int longitud=sc.nextInt();
//        
//    int tabla[]=new int[longitud];
//    for(int i=0;i<tabla.length;i++)
//    {
//        System.out.println("introduce los numeros que quieres que esten dentro de tu array");
//        int numeros=sc.nextInt();
//        tabla[i]=numeros;
//    }
//        System.out.println(Arrays.toString(tabla));
//        
//        maximo(tabla);
//        int maximo=maximo(tabla);
//        System.out.println("el maximo de tu tabla es:" +maximo);
//    }
//}
   
   
   
    //5.5 ejercicio 138
     
   
   
//    static int[] rellenapares(int longitud, int fin){
//        int pares[]= new int[longitud];
//        
//        int i=0;
//        while (i<pares.length)
//        {
//            int num=(int)(Math.random()*fin+1);
//            if(num % 2 ==0)
//            pares[i]= num;
//            i++;
//            
//            Arrays.sort(pares);
//            return(pares);
//        }
//      public static void main(String[] args)
//      {
//             int fin=4;
//         int longitud=2;
//              int pares[]= new int[longitud];
//             rellenapares(longitud, fin);
//         }
//}
   
   
     //5.6 ejercicio 138
    //comparacion
//     public static int aciertos(int boleto[],int resultado[])
//     {
//         int aciertos=0;
//         for(int i=0;i<resultado.length;i++)
//         {
//          if(boleto[i]==resultado[i])
//          {
//              aciertos++;
//          }
//         }
//        
//         return aciertos;
//     }
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    
//    
//    int boleto[]=new int[6];
//    int resultado[]={10,23,34,4,5,62};
//        
//    for(int i=0;i<boleto.length;i++)
//    {
//        int alea=(int)(Math.random()*99);
//        boleto[i]=alea;
//    }
//    
//     System.out.println("el boleto ganador es:" +Arrays.toString(resultado));
//     System.out.println("tu boleto  es:" +Arrays.toString(boleto));
//    
//    aciertos(boleto,resultado);
//    int resul;
//    resul= aciertos(boleto,resultado);
//    System.out.println("el numero de aciertos es:"+resul);
//    
//    
//    
//                    }
//            }
   
   
   
          //pag 158 EJERCICIOS DE APLICACIÓN
   
//EJERCICIO 5.11
   
//   public static void main(String[] args) {
//      int aux[] = {1, 2, 5, 3, 2, 5, 4, 3, 4, 1, 2, 5, 1, 3, 2};
//      System.out.println(Arrays.toString(aux));
//      System.out.println("Escriba un número del 1 al 5:");
//      int aBuscar = new Scanner(System.in).nextInt();
//      int indices[] = buscarTodos(aux, aBuscar);
//
//      System.out.println("El número " + aBuscar + " se encuentra en los índices");
//      System.out.println(Arrays.toString(indices));
//   }
//
//   static int[] buscarTodos(int t[], int clave) {
//      int encontradoEn[] = new int[0];
//
//      for (int i = 0; i < t.length; i++) {
//         if (t[i] == clave) {
//            encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
//            encontradoEn[encontradoEn.length - 1] = i;
//         }
//      }
//
//      return encontradoEn;
//   }
//}


   
   
//EJERCICIO 5.12

//public static void main(String[] args) {
//      int aux[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      System.out.println("Tabla original: " + Arrays.toString(aux));
//
//      desordenar(aux);
//      System.out.println("Tabla desordenada: " + Arrays.toString(aux));
//   }
//
//   static void desordenar(int t[]) {
//      for (int i = 0; i < t.length; i++) {
//         int indice1 = (int) (Math.random() * t.length);
//         int indice2 = (int) (Math.random() * t.length);
//
//         int aux = t[indice1];
//         t[indice1] = t[indice2];
//         t[indice2] = aux;
//      }
   
   
   
   
   
    //ejercicio 5.13
 
//  public static void main(String[] args) {
//      int original[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      
//      int desordenada[] = desordenar(original);
//      
//      System.out.println("Tabla original: " + Arrays.toString(original));
//      System.out.println("Tabla desordenada: " + Arrays.toString(desordenada));
//   }
//
//   static int[] desordenar(int t[]) {
//      int copia[] = Arrays.copyOf(t, t.length);
//      for (int i = 0; i < copia.length; i++) {
//         int indice1 = (int) (Math.random() * t.length);
//         int indice2 = (int) (Math.random() * t.length);
//
//         int aux = copia[indice1];
//         copia[indice1] = copia[indice2];
//         copia[indice2] = aux;
//      }
//      
//      return copia;
//   }
//}
   
   
   
//ejercicio 5.14
   
//    public static void main(String[] args) {
//      double sueldos[] = new double[0];
//      double sueldo;
//
//      System.out.print("¿Cuál es su sueldo?: ");
//      sueldo = new Scanner(System.in).useLocale(Locale.US).nextDouble();
//      while (sueldo != -1) {
//         sueldos = Arrays.copyOf(sueldos, sueldos.length+1);
//         sueldos[sueldos.length-1] = sueldo;
//         System.out.print("¿Cuál es su sueldo?: ");
//         sueldo = new Scanner(System.in).useLocale(Locale.US).nextDouble();
//      }
//      
//      Arrays.sort(sueldos);//ordenamos de forma creciente
//      for (int i = sueldos.length-1; i >= 0; i--) {
//         System.out.println(sueldos[i] + ", ");
//      }
//      
//      System.out.println("\nSueldo máximo: " + sueldos[sueldos.length-1]);
//      System.out.println("Sueldo mínimo: " + sueldos[0]);
//        
//      double suma = 0;
//      for (double aux : sueldos) {
//         suma += aux;
//      }
//      double media = suma / sueldos.length;
//      System.out.println("Media de los sueldos: " + media);
//   }
//}
   
   
   
   
//5.16 ejercicio
   
//public static void main(String[] args) {
//      boolean mapa[][] = {{true,  true,  false, false, false},
//                          {false, true,  true,  false, false},
//                          {false, true,  true,  true,  false},
//                          {true,  false, false, true,  false},
//                          {true,  false, false, false, true}  
//                         };
//      System.out.println("Lugar de origen: ");
//      int origen = new Scanner(System.in).nextInt();
//      System.out.println("Lugar de destino: ");
//      int destino = new Scanner(System.in).nextInt();
//
//      int lugares[] = new int[1];
//      lugares[0] = origen;
//
//      int copia[];
//
//      do {
//         copia = Arrays.copyOf(lugares, lugares.length);
//        
//         System.out.println(Arrays.toString(lugares));
//         for (int lugar : copia) {
//            for (int i = 0; i < mapa.length; i++) {
//               if (mapa[lugar][i]) { //podemos llegar de lugar a i
//                  if (busca(lugares, i) == -1) {
//                     lugares = Arrays.copyOf(lugares, lugares.length + 1);
//                     lugares[lugares.length - 1] = i;
//                  }
//               }
//            }
//         }
//      } while (!Arrays.equals(lugares, copia));
//
//      if (busca(lugares, destino) != -1) {
//         System.out.println("Es posible ir de " + origen + " a " + destino);
//      } else {
//         System.out.println(destino + " es inaccesible desde " + origen);
//      }
//   }
//
//   static int busca(int t[], int clave) {
//      int posicion = -1;
//      int i = 0;
//      while (i < t.length && t[i] != clave) {
//         i++;
//      }
//
//      if (i < t.length) {
//         posicion = i;
//      }
//
//      return posicion;
//   }
//}
//    

    //resultado 5.17
   
   
//public static void main(String[] args) {
//        int t[] = {10, 1, 5, 8, 9, 2};
//        int numElementos = 3;
//        int aux[] = suma(t, numElementos);
//        System.out.println("La sumas de " + Arrays.toString(t));
//        System.out.println("Agrupando " + numElementos + " elementos");
//        System.out.println(Arrays.toString(aux));
//    }
//    
//    static int[] suma(int t[], int numElementos) {
//        int sumas[] = new int[t.length - numElementos + 1];
//        
//        for (int i = 0; i < sumas.length; i++) {
//            sumas[i] = 0;
//            for (int j = 0; j < numElementos; j++) {
//                sumas[i] += t[i+j];
//            }
//        }
//        
//        return sumas;
//    }
//}
   
   
    //EJERCICIO 5.18
   
   
//       public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int patron = 0;
//      final int TAM = 4;
//      int matriz[][] = new int[TAM][TAM];
//
//      for (int i = 0; i < TAM; i++) {
//         for (int j = 0; j < TAM; j++) {
//            System.out.print("Elemento [" + i + "][" + j + "]: ");
//            matriz[i][j] = sc.nextInt();
//         }
//      }
//
//      boolean esMagica = true;
//
//      for (int c = 0; c < TAM; c++) {
//         patron += matriz[0][c];
//      }
//
//      for (int c = 0; c < TAM; c++) {
//         int sumaColumna = 0;
//         for (int f = 0; f < TAM; f++) {
//            sumaColumna += matriz[f][c];
//         }
//         if (sumaColumna != patron) {
//            esMagica = false;
//         }
//      }
//
//      for (int f = 0; f < TAM; f++) {  
//         int sumaFila = 0;
//         for (int c = 0; c < TAM; c++) {  
//            sumaFila += matriz[f][c];
//         }
//         if (sumaFila != patron) {
//            esMagica = false;
//         }
//      }
//
//      if (esMagica) {
//         System.out.println("La matriz es mágica");
//      } else {
//         System.out.println("La matriz no es mágica");
//      }
//   }
//}

 //EJERCICIO 5.19
   
   
//    public static void main(String[] args) {
//      int ranking[];
//      int numCorredores;
//
//      System.out.print("Cuántos corredores participan: ");
//      numCorredores = new Scanner(System.in).nextInt();
//      ranking = new int[numCorredores];
//
//      System.out.println("Escriba los dorsales que van llegando a la meta:");
//      for (int i = 0; i < ranking.length; i++) {
//         System.out.println("Dorsal número: ");
//         ranking[i] = new Scanner(System.in).nextInt();
//      }
//
//      System.out.println(Arrays.toString(ranking));
//      
//      System.out.println("Dorsales de los menores de edad (-1 para acabar)");
//      int dorsal = new Scanner(System.in).nextInt();
//      while (dorsal != -1) {
//         avanza1Puesto(ranking, dorsal);
//         System.out.println(Arrays.toString(ranking)); //comprobamos el ranking
//         System.out.println("Dorsales de los menores de edad (-1 para acabar)");
//         dorsal = new Scanner(System.in).nextInt();
//      }
//
//      System.out.println("Dorsales positivos en antidoping (-1=fin)");
//      dorsal = new Scanner(System.in).nextInt();
//      while (dorsal != -1) {
//         ranking = eliminaOrdenado(ranking, dorsal);
//         System.out.println(Arrays.toString(ranking));
//         System.out.println("Dorsales positivos en antidoping (-1=fin)");
//         dorsal = new Scanner(System.in).nextInt();
//      }
//
//      System.out.println("Dorsales que no han pagado (-1=fin)");
//      dorsal = new Scanner(System.in).nextInt();
//      while (dorsal != -1) {
//         ultimoPuesto(ranking, dorsal);
//         System.out.println(Arrays.toString(ranking));
//         System.out.println("Dorsales que no han pagado (-1=fin)");
//         dorsal = new Scanner(System.in).nextInt();
//      }
//
//      System.out.println("--- Medallero ---");
//      if (ranking.length >= 1) {
//         System.out.println("Oro: " + ranking[0]);
//      }
//      if (ranking.length >= 2) {
//         System.out.println("Plata: " + ranking[1]);
//      }
//      if (ranking.length >= 2) {
//         System.out.println("bronce: " + ranking[2]);
//      }
//   }
//
//   static void avanza1Puesto(int ranking[], int dorsal) {
//      int posicion = busca(ranking, dorsal);
//
//      if (posicion == -1) {
//         System.out.println("Error: el dorsal " + dorsal + " no existe.");
//      } else {
//         if (posicion != 0) {
//            int aux = ranking[posicion - 1];
//            ranking[posicion - 1] = ranking[posicion];
//            ranking[posicion] = aux;
//         }
//      }
//   }
//
//   static int busca(int t[], int clave) {
//      int posicion = -1;
//      int i = 0;
//      while (i < t.length && t[i] != clave) {
//         i++;
//      }
//
//      if (i < t.length) {
//         posicion = i;
//      }
//
//      return posicion;
//   }
//
//   static int[] eliminaOrdenado(int t[], int clave) {
//      int posicion = busca(t, clave);
//
//      if (posicion == -1) {
//         System.out.println("Error: el dorsal " + clave + " no existe.");
//      } else {
//
//         System.arraycopy(t, posicion + 1, t, posicion, t.length - posicion - 1);
//         t = Arrays.copyOf(t, t.length - 1);
//      }
//
//      return t;
//   }
//
//   static void ultimoPuesto(int ranking[], int dorsal) {
//      int posicion = busca(ranking, dorsal);
//
//      if (posicion == -1) {
//         System.out.println("Error: el dorsal " + dorsal + " no existe.");
//      } else {
//         System.arraycopy(ranking, posicion + 1,
//                 ranking, posicion, ranking.length - posicion - 1);
//         ranking[ranking.length - 1] = dorsal;
//      }
//   }
//}
//    
   
   
     //EJERCICIO 5.20
   
   
//    public static void main(String[] args) {
//        int a[] = {10, 12, 14, 20, 22, 24};
//        int b[] = {5, 10, 15, 18, 19, 21, 23, 35};
//        
//        int c[] = fusion(a, b);
//        System.out.println("a: " + Arrays.toString(a));
//        System.out.println("b: " + Arrays.toString(b));
//        System.out.println("c: " + Arrays.toString(c));
//    }
//    
//    static int[] fusion(int t1[], int t2[]) {
//        int i1 = 0;
//        int i2 = 0;
//        int iC = 0;
//        
//        int c[] = new int[t1.length + t2.length];
//        while (i1<t1.length && i2<t2.length) {
//            if(t1[i1] <= t2[i2]) {
//                c[iC] = t1[i1];
//                i1++;
//            } else {
//                c[iC] = t2[i2];
//                i2++;
//            }
//            iC++;
//        }
//        
//          
//        if (i1 == t1.length) {
//            while(i2<t2.length) {
//                c[iC] = t2[i2];
//                i2++;
//                iC++;
//            }
//        } else {
//            while(i2<t1.length) {
//                c[iC] = t1[i1];
//                i1++;
//                iC++;
//            }
//        }
//        
//        return c;
//    }
//}
   
//Ejercicio email
//OPCION 1

//     public static void mezclar(int array1,int array2)
//     {
//        
//     }
//    public static void main(String[] args) {
//        //Generar dos arrays de enteros de tamaño aleatorio (entre 0 y 10 inclusive).
//        //declaración de variables
//        double alea;
//        int[]array1;
//        int[]array2;
//        int longitud1;
//        int longitud2;
//        int rango=10;
//        int rango2=100;
//        int numero;
//        int cf=0;
//        int c1=0;
//        int c2=0;
//          
//      
//      
//      
//      
//        alea= Math.random();// valor en el rango (0,1)
//        longitud1= (int)(alea* 10);
//        longitud1 = (int)((alea*rango)+1);
//        array1 =new int[longitud1];
//      
//        alea= Math.random();// valor en el rango (0,1)
//        numero= (int)(alea* 100);
//        numero = (int)((alea*rango2)+1);
//      
//        for(int i=0;i<longitud1;i++)
//        {
//            alea= Math.random();// valor en el rango (0,1)
//             numero= (int)(alea* 100);
//             numero = (int)((alea*rango2)+1);
//            array1[i]=numero;
//          
//          
//        }
//       System.out.println(Arrays.toString(array1));
//      
//        alea= Math.random();// valor en el rango (0,1)
//        longitud2= (int)(alea* 10);
//        longitud2 = (int)((alea*rango)+1);
//        array2 =new int[longitud2];
//      
//        alea= Math.random();// valor en el rango (0,1)
//        numero= (int)(alea* 100);
//        numero = (int)((alea*rango2)+1);
//      
//        for(int i=0;i<longitud2;i++)
//        {
//            alea= Math.random();// valor en el rango (0,1)
//             numero= (int)(alea* 100);
//             numero = (int)((alea*rango2)+1);
//            array2[i]=numero;
//          
//          
//        }
//       System.out.println(Arrays.toString(array2));
//       int[]mezcla;
//       mezcla = new int[array1.length+array2.length];
//    
//       while(cf<mezcla.length)
//       {
//       //array1
//            if(c1<array1.length)
//            {
//                mezcla[cf]=array1[c1];
//                cf++;
//                c1++;
//            }
//        //array2
//            if(c2<array2.length)
//            {
//                mezcla[cf]=array2[c2];
//                cf++;
//                c2++;
//            }
//       }    
//        System.out.println(Arrays.toString(mezcla));
//  
//    }
//}
   
   
    //OPCION 2
   
   
// public static void main(String[] args) {
//    
//    
// int alea=(int)(Math.random()*10);
// int longitud1 =alea;
// alea=(int)(Math.random()*10);
// int longitud2 =alea;
//
// int tabla1[]=new int[longitud1];
// int tabla2[]=new int [longitud2];
//
//
// //array1 rellenar con numeros
// for(int i=0;i<tabla1.length;i++)
// {
//     alea=(int)(Math.random()*100);
//     tabla1[i]=alea;
// }
//     System.out.println("array1->"+Arrays.toString(tabla1));
//    
//    
////array1 rellenar con numeros
//for(int i=0;i<tabla2.length;i++)
//{
//    alea=(int)(Math.random()*100);
//     tabla2[i]=alea;
//}
// System.out.println("array2->"+Arrays.toString(tabla2));
//
//
// int conjunto[]=new int[tabla1.length+tabla2.length];
// int cf=0;
// int c1=0;
// int c2=0;
//
//
// while(cf<conjunto.length)
// {
//     if(c1<tabla1.length)
//     {
//         conjunto[cf]=tabla1[c1];
//        
//         c1++;
//         cf++;
//     }
//     if(c2<tabla2.length)
//     {
//         conjunto[cf]=tabla2[c2];
//         c2++;
//         cf++;
//     }
// }
//     System.out.println("resultado->"+Arrays.toString(conjunto));
// }
//}


    }
    
}
