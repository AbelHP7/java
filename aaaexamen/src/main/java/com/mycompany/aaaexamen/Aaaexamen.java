/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aaaexamen;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Aaaexamen {

    public static void main(String[] args) {
        Robot r1;
        Robot r2;
        Robot r3;
         Robot r4;
       
        Robot[] robots=new Robot[4];
      
       
        int alea = (int) (Math.random() * 15) + 25;
        r1=new Robot("robot2",alea,200,2002,2);
        alea = (int) (Math.random() * 15) + 25;
        r2=new Robot("robot2",alea,200,2002,2);
        alea = (int) (Math.random() * 15) + 25;
        r3=new Robot("robot3",alea,200,2002,2);
        alea = (int) (Math.random() * 15) + 25;
        r4=new Robot("robot4",alea,200,2002,2);
        
        robots[0]=r1;
        robots[1]=r2;
        robots[2]=r3;
        robots[3]=r4;
        
        
        
       for(int i=0;i<robots.length;i++)
       {
           int alea2 = (int) (Math.random() * 51) + 50;
           robots[i].setCargaactual(alea2);
       }

       
    }

public static int oldest(Robot[] robots) {
        int oldestempezar = 0;
        int oldestaño = robots[0].añof;

        for (int i = 1; i < robots.length; i++) {
            if (robots[i].añof < oldestaño) {
                oldestaño = robots[i].añof;
                oldestempezar = i;
            }
        }
        return oldestempezar;
    }
}

   public static int race(Robot[] robots)
   {
       
   }


