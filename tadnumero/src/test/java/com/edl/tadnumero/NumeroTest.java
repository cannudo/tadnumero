package com.edl.tadnumero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {

    @Test
    void testValorMaiorQue100() {
        Numero numero = new Numero();
        numero.setValor(150);
        assertEquals(100, numero.getValor(), "Valor maior que 100 deve ser convertido para 100");
    }

    @Test
    void testValorMenorQue0() {
        Numero numero = new Numero();
        numero.setValor(-10);
        assertEquals(0, numero.getValor(), "Valor menor que 0 deve ser convertido para 0");
    }

    @Test
    void testValorEntre40E50() {
        Numero numero = new Numero();
        numero.setValor(45);
        assertEquals(40, numero.getValor(), "Valor entre 40 e 50 deve ser convertido para 40");
    }

    @Test
    void testValorEntre50E60() {
        Numero numero = new Numero();
        numero.setValor(55);
        assertEquals(60, numero.getValor(), "Valor entre 50 e 60 deve ser convertido para 60");
    }

    @Test
    void testValorDentroDoIntervalo() {
        Numero numero = new Numero();
        numero.setValor(30);
        assertEquals(30, numero.getValor(), "Valor dentro do intervalo permitido deve permanecer inalterado");
    }
}
