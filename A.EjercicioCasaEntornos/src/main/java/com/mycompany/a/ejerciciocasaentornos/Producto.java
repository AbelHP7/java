/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciocasaentornos;

/**
 *
 * @author usuario
 */
public class Producto {
    protected int FechaDeCaducidad;
    protected int nDeLote;

    public Producto(int FechaDeCaducidad, int nDeLote) {
        this.FechaDeCaducidad = FechaDeCaducidad;
        this.nDeLote = nDeLote;
    }

    public int getFechaDeCaducidad() {
        return FechaDeCaducidad;
    }

    public int getnDeLote() {
        return nDeLote;
    }

    public void setFechaDeCaducidad(int FechaDeCaducidad) {
        this.FechaDeCaducidad = FechaDeCaducidad;
    }

    public void setnDeLote(int nDeLote) {
        this.nDeLote = nDeLote;
    }

    @Override
    public String toString() {
        return "Producto{"+ "FechaDeCaducidad=" + FechaDeCaducidad + ", numero de lote=" + nDeLote + "}";
    }
}
