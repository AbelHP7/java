/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectojunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest 
{

    @Test
    public void testSuma()
    {
        double resultado = Calculadora.operar(5.0, 3.0, 1);
        assertEquals(8.0, resultado, 0.0001);
    }

    @Test
    public void testResta() 
    {
        double resultado = Calculadora.operar(5.0, 3.0, 2);
        assertEquals(2.0, resultado, 0.0001);
    }

    @Test
    public void testMultiplicacion()
    {
        double resultado = Calculadora.operar(5.0, 3.0, 3);
        assertEquals(15.0, resultado, 0.0001);
    }

    @Test
    public void testDivision()
    {
        double resultado = Calculadora.operar(6.0, 3.0, 4);
        assertEquals(2.0, resultado, 0.0001);
    }

    @Test
    public void testDivisionPorCero() 
    {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.operar(6.0, 0.0, 4);
        });
        assertEquals("No se puede dividir entre cero.", exception.getMessage());
    }

    @Test
    public void testOpcionInvalida() 
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.operar(6.0, 3.0, 5);
        });
        assertEquals("Opción no válida.", exception.getMessage());
    }
}