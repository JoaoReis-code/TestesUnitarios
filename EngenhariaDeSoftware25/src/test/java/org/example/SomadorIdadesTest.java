package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomadorIdadesTest {

    @Test
    @DisplayName("Tentando condicao pare maiusculo")
    void SomaIdade_CondicaoPareMaiusculo() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(5.0, somador.soma(5.0, "PARE"));
    }

    @Test
    @DisplayName("Tentando condicao pare minusculo")
    void SomaIdade_CondicaoPareMinusculo() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(5.0, somador.soma(5.0, "pare"));
    }

    @Test
    @DisplayName("Tentando condicao pare misturado")
    void SomaIdade_CondicaoPareMisturado() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(5.0, somador.soma(5.0, "PaRe"));
    }

    @Test
    @DisplayName("Resultado maior que 18 e menor")
    void SomaIdade_IdadesMaiorComMenor() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(31.0, somador.soma(31.0, "7.0"));
    }

    @Test
    @DisplayName("Resultado maiores de idade")
    void SomaIdade_SomandoMaiores() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(53.0, somador.soma(30.0, "23.0"));
    }

    @Test
    @DisplayName("Somando fracoes de idade")
    void SomaIdade_SomandoFracoes() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(43.8, somador.soma(25.5, "18.3"));
    }

    @Test
    @DisplayName("Somando fracoes de idade com negativos")
    void SomaIdade_SomandoFracoesComInteiros() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(25.5, somador.soma(25.5, "-20"));
    }

    @Test
    @DisplayName("Somando idades menores que 18")
    void SomaIdade_SomandoIdadesMenores() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(0, somador.soma(0, "10"));
    }

    @Test
    @DisplayName("Tentando passar idade decimal menor ao input")
    void SomaIdade_TestandoParametroInput() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(23.33, somador.soma(23.33, "10.67"));
    }

    @Test
    @DisplayName("Decimal negativo passado ao input")
    void SomaIdade_TestandoDecimalNegativoParametroInput() {
        SomadorIdades somador = new SomadorIdades();
        assertEquals(28.0, somador.soma(28.0, "-18"));
    }
}