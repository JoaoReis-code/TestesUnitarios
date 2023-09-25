package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ProgressaoGeometricaTest {

    @Test
    @DisplayName("PG crescente com razao 2")
    void CalcularPG_ProgressaoCrescente(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 512.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(8,4,2)));
    }

    @Test
    @DisplayName("Potenciacao base 2")
    void CalcularPG_PotenciacaoBase2(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 512.0, 1024.0, 2048.0, 4096.0, 8192.0, 16384.0, 32768.0, 65536.0, 131072.0, 262144.0, 524288.0, 1048576.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(20,2,2)));
    }

    @Test
    @DisplayName("PG com razao negativa")
    void CalcularPG_RegressaoGeometrica(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {6.0, -18.0, 54.0, -162.0, 486.0, -1458.0, 4374.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(7,6,-3)));
    }

    @Test
    @DisplayName("PG negativa com Razao negativa")
    void CalcularPG_RegressaoGeometricaComRazaoPositiva(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {-4.0, -32.0, -256.0, -2048.0, -16384.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(5,-4,8)));
    }

    @Test
    @DisplayName("PG constante")
    void CalcularPG_PGConstante(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {2.0, 2.0, 2.0, 2.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(4,2,1)));
    }

    @Test
    @DisplayName("PG de razao 0")
    void CalcularPG_PGComRazao0(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {5.0, 0.0, 0.0, 0.0, 0.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(5,5,0)));
    }

    @Test
    @DisplayName("PG de razao 1")
    void CalcularPG_PGComRazao1(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {4.0, 4.0, 4.0, 4.0, 4.0, 4.0};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(6,4,1)));
    }

    @Test
    @DisplayName("PG de razao decimal")
    void CalcularPG_PGComRazaoDecimal(){
        var pg = new ProgressaoGeometrica();
        double[] PG = {5.0, 27.0, 145.8, 787.3200000000002, 4251.528000000001, 22958.25120000001, 123974.55648000004, 669462.6049920003};
        Assertions.assertTrue(Arrays.equals(PG,pg.CalcularPG(8,5,5.4)));
    }

    @Test
    @DisplayName("Numero de termos com valor negativo")
    void CalcularPG_PGArrayNegativo() {
        var pg = new ProgressaoGeometrica();
        Assertions.assertThrows(NegativeArraySizeException.class, () -> pg.CalcularPG(-5,-1,-2.8));
    }

    @Test
    @DisplayName("PG nao possui termos")
    void CalcularPG_PGArrayZero() {
        var pg = new ProgressaoGeometrica();
        Assertions.assertThrows(NegativeArraySizeException.class, () -> pg.CalcularPG(0,1,1));
    }
}
