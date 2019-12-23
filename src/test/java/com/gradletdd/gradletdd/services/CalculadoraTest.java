package com.gradletdd.gradletdd.services;

import com.gradletdd.gradletdd.exceptions.NaoPodeDividirPorZeroException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * CalculadoraTest
 */
public class CalculadoraTest {

    private static CalculadoraService service;

    @BeforeAll
    public static void setup() {
        service = new CalculadoraService();
    }

    @Test
    public void deveSomarDoisValores() {
        // cenario
        int a = 5;
        int b = 3;

        // acao
        int resultado = service.somar(a, b);

        // verificacao
        Assertions.assertEquals(8, resultado);

    }

    @Test
    public void deveSubtrairDoisValores() {
        // cenario
        int a = 8;
        int b = 5;

        // acao
        int resultado = service.subtrair(a, b);

        // verificacao
        Assertions.assertEquals(3, resultado);

    }

    @Test
    public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
        // cenario
        int a = 6;
        int b = 3;

        // acao
        int resultado = service.divide(a, b);

        // verificacao
        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void deveLancarExcecaoAoDividirPorZero() {
        int a = 10;
        int b = 0;

        Assertions.assertThrows(NaoPodeDividirPorZeroException.class, () -> {
            service.divide(a, b);
        });
    }

    @Test
    public void deveDividir() {
        String a = "6";
        String b = "3";

        int resultado = service.divide(a, b);

        Assertions.assertEquals(2, resultado);
    }
    
}