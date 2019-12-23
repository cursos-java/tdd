package com.gradletdd.gradletdd.services;

import com.gradletdd.gradletdd.exceptions.NaoPodeDividirPorZeroException;

/**
 * CalculadoraService
 */
public class CalculadoraService {

    public Integer somar(int a, int b) {
        return a + b;
    }

    public Integer subtrair(int a, int b) {
        return a - b;
    }

    public Integer divide(int a, int b) throws NaoPodeDividirPorZeroException {
        if(b == 0) {
            throw new NaoPodeDividirPorZeroException();
        }
        return a / b;
    }

    public Integer divide(String a, String b) {
        return Integer.valueOf(a) / Integer.valueOf(b);
    }

    public static void main(String[] args) {
        new CalculadoraService().divide("a", "b");
    }
    
}