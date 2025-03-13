/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciocasaentornos;

/**
 *
 * @author usuario
 */
public class ProductoCongelado extends Producto{
    private int temp;

    public ProductoCongelado(  int nDeLote, int FechaDeCaducidad,int temp) {
        super(FechaDeCaducidad, nDeLote);
        this.temp = temp;
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
        return "ProductoCongelado{"+ "numero de lote=" + nDeLote +", fecha de caducidad=" + FechaDeCaducidad + ", temperatura=" + temp + '}';
    }
   
}
