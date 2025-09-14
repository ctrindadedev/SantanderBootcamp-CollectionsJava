package main.java.map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras = new HashMap<>();

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if (!contagemPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }

        if (palavraMaisFrequente != null) {
            return "Palavra mais frequente: '" + palavraMaisFrequente + "' com " + maiorContagem + " ocorrências.";
        } else {
            return "Não há palavras.";
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Java", 10);
        contagem.adicionarPalavra("Python", 5);
        contagem.adicionarPalavra("C++", 7);
        contagem.adicionarPalavra("TypeScript", 10);
        contagem.exibirContagemPalavras();
        // Deve retornar a primeira encontrada com 10
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.adicionarPalavra("TypeScript", 15);
        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.removerPalavra("Python");
        contagem.exibirContagemPalavras();
    }
}

