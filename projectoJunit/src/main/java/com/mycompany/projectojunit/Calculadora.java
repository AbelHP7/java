/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectojunit;

/**
 *
 * @author usuario
 */
public class Calculadora {
     public static double operar(double num1, double num2, int opcion) {
        switch (opcion) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Opción no válida.");
        }
    }
}
