/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._arrayslist_primitiva;

import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class CompararInteger implements Comparator{

   
    @Override
    public int compare(Object obj1,Object obj2)
    {
        Integer primero,segundo;
        primero=(Integer) obj1;
        segundo =(Integer) obj2;
        
        if(primero==segundo)
            return 0;
        else
            if(primero<segundo)
                return -1;
            else
                return 1;
        
    }
    
    
}
