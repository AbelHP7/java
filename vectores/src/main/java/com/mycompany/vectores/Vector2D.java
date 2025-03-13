/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

/**
 *
 * @author usuario
 */
public class Vector2D {
    private int x,y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Metodo para sobrecargar la suma de vectores
    public Vector2D add(Vector2D otro){
        return new Vector2D(this.x + otro.x, this.y + otro.y);
    }
    public Vector2D subtract(Vector2D otro){
        return new Vector2D(this.x - otro.x, this.y-otro.y);     
    }    
    @Override
    public String toString() {
        return "Vector2D{" + "x=" + x + ", y=" + y + '}';
    }
}
