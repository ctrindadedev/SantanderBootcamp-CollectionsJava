package main.java.map.Ordenacao;
import java.util.*;

public class LivrariaOnline {
   private Map<String, Livro> livros;

    public LivrariaOnline(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (livros.isEmpty()) {
            System.out.println("Ainda não foi adicionado nenhumm livros");
            return;
        }
        String chaveParaRemover = null;
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chaveParaRemover = entry.getKey();
                break;
            }
        }
        if (chaveParaRemover != null) {
            livros.remove(chaveParaRemover);
            System.out.println("Livro '" + titulo + "' removido");
        } else {
            System.out.println("Livro com título '" + titulo + "' não encontrado");
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        if (livros.isEmpty()) {
            System.out.println("Ainda não foi adicionado nenhumm livros");
            return;
        }

        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livros.entrySet());
        livrosParaOrdenar.sort(new ComparatorPorPreco());


        // LinkedHashMap para manter a ordem de inserção (a ordem de preço)
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosParaOrdenar) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Livros ordenados por preço:");
        System.out.println(livrosOrdenados);
    }

    public Livro exibirLivroMaisBarato() {
        if (livros.isEmpty()) {
            return null;
        }
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() < menorPreco) {
                menorPreco = livro.getPreco();
                livroMaisBarato = livro;
            }
        }
        return livroMaisBarato;
    }

    public Livro exibirLivroMaisCaro(){
        if (livros.isEmpty()) {
            return null;
        }
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() < maiorPreco) {
                maiorPreco = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return exibirLivroMaisCaro();
    }

    public List<Livro> pesquisarLivroPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (livros.isEmpty()) {
            return livrosPorAutor;
        }
        for (Livro livro : livros.values()) {
            if(livro.getAutor().equals(autor)) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }
}

