package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!dicionarioMap.isEmpty()) {
      dicionarioMap.remove(palavra);
    } else {
      System.out.println("O dicionário está vazio");
    }
  }

  public void exibirPalavras() {
    if (!dicionarioMap.isEmpty()) {
      System.out.println(dicionarioMap);
    } else {
      System.out.println("O dicionário está vazio");
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    String definicao = dicionarioMap.get(palavra);
    if (definicao != null) {
      return definicao;
    }
    return "Palavra não encontrada no dicionário";
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    // Adicionar palavras
    dicionario.adicionarPalavra("Java", "Uma linguagem de programação orientada a objetos");
    dicionario.adicionarPalavra("Map", "Uma coleção que mapeia chaves a valores");
    dicionario.adicionarPalavra("Set", "Uma coleção que não permite elementos duplicados");

    // Exibir palavras
    System.out.println("Dicionário atual:");
    dicionario.exibirPalavras();

    // Pesquisar por palavra
    System.out.println("Definição de 'Java': " + dicionario.pesquisarPorPalavra("Java"));
    System.out.println("Definição de 'List': " + dicionario.pesquisarPorPalavra("List"));

    // Remover palavra
    dicionario.removerPalavra("Set");
    System.out.println("Dicionário após remover 'Set':");
    dicionario.exibirPalavras();
  }
}