package com.exemplo.analisador.test;

import com.exemplo.analisador.FraseBean;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class FraseBeanTest {
    private FraseBean fraseBean;

    @Before
    public void setUp() {
        fraseBean = new FraseBean();
    }

    @Test
    public void testFraseSimples() {
        fraseBean.setFrase("teste teste exemplo");
        fraseBean.analisar();

        Map<String, Integer> resultado = fraseBean.getContagemPalavras();

        assertNotNull(resultado);
        assertEquals(2, resultado.size());
        assertEquals(Integer.valueOf(2), resultado.get("teste"));
        assertEquals(Integer.valueOf(1), resultado.get("exemplo"));
    }

    @Test
    public void testFraseComPontuacao() {
        fraseBean.setFrase("Olá, mundo! Olá?");
        fraseBean.analisar();

        Map<String, Integer> resultado = fraseBean.getContagemPalavras();

        assertNotNull(resultado);
        assertEquals(2, resultado.size()); 
        assertEquals(Integer.valueOf(2), resultado.get("olá"));
        assertEquals(Integer.valueOf(1), resultado.get("mundo"));
    }

    @Test
    public void testFraseVazia() {
        fraseBean.setFrase("");
        fraseBean.analisar();

        Map<String, Integer> resultado = fraseBean.getContagemPalavras();
        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testFraseComEspacos() {
        fraseBean.setFrase("     ");
        fraseBean.analisar();

        Map<String, Integer> resultado = fraseBean.getContagemPalavras();
        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testFraseNull() {
        fraseBean.setFrase(null);
        fraseBean.analisar();

        Map<String, Integer> resultado = fraseBean.getContagemPalavras();
        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }
}
