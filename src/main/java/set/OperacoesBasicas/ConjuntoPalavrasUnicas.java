package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicasSet.isEmpty()) {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (palavrasUnicasSet.remove(palavra)) {
            System.out.println("Palavra '" + palavra + "' removida.");
        } else {
            System.out.println("Palavra '" + palavra + "' não encontrada no conjunto.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (palavrasUnicasSet.isEmpty()) {
            throw new RuntimeException("O conjunto está vazio!");
        } else {
            System.out.println("Palavras únicas no conjunto: \n");
            System.out.println(palavrasUnicasSet);
        }
    }

}
