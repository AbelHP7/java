/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectojunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author usuario
 */
public class CalculadoraTest {
    @Test
    public void testSuma() {
        assertEquals(8, Calculadora.operar(5, 3, 1));
    }

    @Test
    public void testResta() {
        assertEquals(2, Calculadora.operar(5, 3, 2));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(15, Calculadora.operar(5, 3, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculadora.operar(6, 3, 4));
    }

    @Test
    public void testDivisionPorCero() {
        Exception e = assertThrows(ArithmeticException.class, () -> {
            Calculadora.operar(5, 0, 4);
        });
        assertEquals("No se puede dividir entre cero.", e.getMessage());
    }

    @Test
    public void testOpcionInvalida() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.operar(5, 3, 7);
        });
        assertEquals("Opción no válida.", e.getMessage());
    }
}

