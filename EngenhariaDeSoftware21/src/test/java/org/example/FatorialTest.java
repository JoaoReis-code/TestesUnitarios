package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FatorialTest {

    @Test
    @DisplayName("0 fatorial deve retornar 1")
    void CalcularFatorial_0fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.ONE,f.calcularFatorial(0));
    }

    @Test
    @DisplayName("-0 fatorial deve retornar 1")
    void CalcularFatorial_menos0fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.ONE,f.calcularFatorial(-0));
    }

    @Test
    @DisplayName("1 fatorial deve retornar 1")
    void CalcularFatorial_1fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.ONE,f.calcularFatorial(1));
    }

    @Test
    @DisplayName("2 fatorial deve retornar 2")
    void CalcularFatorial_2fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.TWO,f.calcularFatorial(2));
    }

    @Test
    @DisplayName("5 fatorial deve retornar 120")
    void CalcularFatorial_5fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.valueOf(120),f.calcularFatorial(5));
    }

    @Test
    @DisplayName("6 fatorial deve retornar 720")
    void CalcularFatorial_6fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.valueOf(720),f.calcularFatorial(6));
    }

    @Test
    @DisplayName("10 fatorial deve retornar 3628800")
    void CalcularFatorial_10fatorial() {
        Fatorial f = new Fatorial();
        Assertions.assertEquals(BigInteger.valueOf(3628800),f.calcularFatorial(10));
    }

    @Test
    @DisplayName("Fatorial deve ser maior que MAX_INT")
    void CalcularFatorial_ValorMaiorQueInt() {
        int maxInt = 2147483647;
        Fatorial f = new Fatorial();
        Assertions.assertTrue(f.calcularFatorial(100).compareTo(BigInteger.valueOf(maxInt)) == 1);
    }

    @Test
    @DisplayName("-1 deve retornar 0")
    void CalcularFatorial_ValorNegativo() {
        Fatorial f = new Fatorial();
        Assertions.assertTrue(f.calcularFatorial(-1) == BigInteger.ZERO);
    }

    @Test
    @DisplayName("-100 deve retornar 0")
    void CalcularFatorial_ValorDecimal() {
        Fatorial f = new Fatorial();
        Assertions.assertTrue(f.calcularFatorial(-100) == BigInteger.ZERO);
    }

}