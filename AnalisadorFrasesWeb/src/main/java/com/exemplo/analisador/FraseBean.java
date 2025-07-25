package com.exemplo.analisador;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@Named("fraseBean")
@ViewScoped
public class FraseBean implements Serializable {

    private String frase;
    private Map<String, Integer> contagemPalavras;

    public void analisar() {
        System.out.println("Frase recebida: " + frase);

        contagemPalavras = new LinkedHashMap<>();

        if (frase != null && !frase.trim().isEmpty()) {
            String[] palavras = frase.toLowerCase().split("\\s+");

            for (String palavra : palavras) {
                palavra = palavra.replaceAll("[^\\p{L}0-9]", ""); // Remove pontuação
                if (!palavra.isEmpty()) {
                    contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
                }
            }
        }
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Map<String, Integer> getContagemPalavras() {
        return contagemPalavras;
    }
}