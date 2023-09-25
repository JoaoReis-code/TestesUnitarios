package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomadorTest {

    @Test
    @DisplayName("Tentando condicao pare maiusculo")
    void Soma_CondicaoPareMaiusculo() {
        Somador somador = new Somador();
        assertEquals(5.0, somador.soma(5.0, "PARE"));
    }

    @Test
    @DisplayName("Tentando condicao pare minusculo")
    void Soma_CondicaoPareMinusculo() {
        Somador somador = new Somador();
        assertEquals(5.0, somador.soma(5.0, "pare"));
    }

    @Test
    @DisplayName("Tentando condicao pare misturado")
    void Soma_CondicaoPareMisturado() {
        Somador somador = new Somador();
        assertEquals(5.0, somador.soma(5.0, "PaRe"));
    }

    @Test
    @DisplayName("Somando numeros naturais")
    void Soma_SomandoNaturais() {
        Somador somador = new Somador();
        assertEquals(10.0, somador.soma(3, "7"));
    }

    @Test
    @DisplayName("Somando numeros inteiros")
    void Soma_SomandoInteiros() {
        Somador somador = new Somador();
        assertEquals(20.0, somador.soma(-3, "23"));
    }

    @Test
    @DisplayName("Somando numeros decimais")
    void Soma_SomandoDecimais() {
        Somador somador = new Somador();
        assertEquals(35.5, somador.soma(25.5, "10"));
    }

    @Test
    @DisplayName("Somando numeros decimais com inteiros")
    void Soma_SomandoDecimaisComInteiros() {
        Somador somador = new Somador();
        assertEquals(15.5, somador.soma(25.5, "-10"));
    }

    @Test
    @DisplayName("Somando numeros decimais com naturais")
    void Soma_SomandoComNaturais() {
        Somador somador = new Somador();
        assertEquals(23.2, somador.soma(13.2, "10"));
    }

    @Test
    @DisplayName("Decimal passado ao input")
    void Soma_TestandoParametroInput() {
        Somador somador = new Somador();
        assertEquals(24.00, somador.soma(13.33, "10.67"));
    }

    @Test
    @DisplayName("Decimal negativo passado ao input")
    void Soma_TestandoDecimalNegativoParametroInput() {
        Somador somador = new Somador();
        assertEquals(2.5, somador.soma(13.33, "-10.83"));
    }
}