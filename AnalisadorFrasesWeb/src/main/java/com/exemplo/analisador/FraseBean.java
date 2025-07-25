package com.exemplo.analisador;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.*;

@Named
@ViewScoped
public class FraseBean implements Serializable {

    private String frase;
    private Map<String, Integer> resultado;
    private int totalPalavrasDistintas;

    public void analisar() {
        if (frase == null || frase.trim().isEmpty()) {
            resultado = Collections.emptyMap();
            totalPalavrasDistintas = 0;
            return;
        }

        Map<String, Integer> contador = new LinkedHashMap<>();
        String[] palavras = frase.toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", " ").split("\\s+");

        for (String palavra : palavras) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        this.resultado = contador;
        this.totalPalavrasDistintas = contador.size();
    }

    public String getFrase() { return frase; }
    public void setFrase(String frase) { this.frase = frase; }
    public Map<String, Integer> getResultado() { return resultado; }
    public int getTotalPalavrasDistintas() { return totalPalavrasDistintas; }
}
