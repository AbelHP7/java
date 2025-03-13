/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciocasaentornos;

/**
 *
 * @author usuario
 */
public class ProductoFresco extends Producto{
    private int FechaDeEnvasado;
    private String Pais;

    public ProductoFresco( int nDeLote, int FechaDeCaducidad,int FechaDeEnvasado, String Pais) {
        super(FechaDeCaducidad, nDeLote);
        this.FechaDeEnvasado = FechaDeEnvasado;
        this.Pais = Pais;
    }

    public int getFechaDeEnvasado() {
        return FechaDeEnvasado;
    }

    public String getPais() {
        return Pais;
    }

    public void setFechaDeEnvasado(int FechaDeEnvasado) {
        this.FechaDeEnvasado = FechaDeEnvasado;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "numero de lote=" + nDeLote +", fecha de caducidad=" + FechaDeCaducidad + ", FechaDeEnvasado=" + FechaDeEnvasado + ", Pais=" + Pais + "}";
    }
   
}