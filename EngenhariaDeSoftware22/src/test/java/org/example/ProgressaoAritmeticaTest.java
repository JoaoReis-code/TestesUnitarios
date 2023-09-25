package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class ProgressaoAritmeticaTest {

    @Test
    @DisplayName("PA crescente de 1 a 10 com razao 1")
    void CalcularPA_Contagem1a10() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(10,1,1)));
    }

    @Test
    @DisplayName("PA decrescente 1 a 10 com razao -1")
    void CalcularPA_ContagemRegressiva() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(10,10,-1)));
    }

    @Test
    @DisplayName("PA decrescente negativa com razao -2")
    void CalcularPA_NegativaDecrescente() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {-1.0, -3.0, -5.0, -7.0, -9.0, -11.0, -13.0, -15.0};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(8,-1,-2)));
    }

    @Test
    @DisplayName("PA constante")
    void CalcularPA_PAConstante() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {1,1,1,1,1,1,1,1,1,1,1,1};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(12,1,0)));
    }

    @Test
    @DisplayName("PA com apenas valores impares")
    void CalcularPA_PAImpar() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {1.0, 3.0, 5.0, 7.0, 9.0, 11.0, 13.0};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(7,1,2)));
    }

    @Test
    @DisplayName("PA com apenas valores pares")
    void CalcularPA_PAPAar() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {2.0, 6.0, 10.0, 14.0, 18.0, 22.0, 26.0, 30.0};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(8,2,4)));
    }

    @Test
    @DisplayName("PA crescente com apenas valores decimais")
    void CalcularPA_PADecimal() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {14.3, 16.400000000000002, 18.5, 20.6, 22.700000000000003, 24.8};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(6,14.3,2.1)));
    }

    @Test
    @DisplayName("PA negativa decrescente com apenas valores decimais")
    void CalcularPA_PADecimalNegativa() {
        var pa = new ProgressaoAritmetica();
        double[] PA = {-1.0, -3.8, -6.6, -9.399999999999999, -12.2};
        Assertions.assertTrue(Arrays.equals(PA,pa.CalcularPA(5,-1,-2.8)));
    }

    @Test
    @DisplayName("Numero de termos com valor negativo")
    void CalcularPA_PAArrayNegativo() {
        var pa = new ProgressaoAritmetica();
        Assertions.assertThrows(NegativeArraySizeException.class, () -> pa.CalcularPA(-5,-1,-2.8));
    }

    @Test
    @DisplayName("PA nao possui termos")
    void CalcularPA_PAArrayZeroo() {
        var pa = new ProgressaoAritmetica();
        Assertions.assertThrows(NegativeArraySizeException.class, () -> pa.CalcularPA(0,1,1));
    }
}