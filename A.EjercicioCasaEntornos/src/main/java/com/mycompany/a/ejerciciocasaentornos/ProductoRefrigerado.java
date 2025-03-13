/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.ejerciciocasaentornos;

/**
 *
 * @author usuario
 */
public class ProductoRefrigerado  extends Producto{
    private int codigo;

    public ProductoRefrigerado(int nDeLote,int FechaDeCaducidad, int codigo) {
        super(FechaDeCaducidad, nDeLote);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "numero de lote=" + nDeLote +", fecha de caducidad=" + FechaDeCaducidad + ", codigo=" + codigo + '}';
    }
   
}
