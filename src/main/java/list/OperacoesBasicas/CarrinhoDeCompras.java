package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;
    public CarrinhoDeCompras() {
        listaItems = new ArrayList<Item>();
    }
    public void adicionaItem(String nome, Integer quantidade, Float preco) {
        listaItems.add(new Item(nome,  quantidade, preco));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (listaItems.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        for (Item item : listaItems) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        if (itensParaRemover.isEmpty()) {
            System.out.println("O item '" + nome + "' não foi encontrado no carrinho");
        } else {
            listaItems.removeAll(itensParaRemover);
        }
    }

    public List<Item> getListaItems() {
        if (listaItems.isEmpty()) {
            return listaItems;
        }
        return listaItems;
    }

    public double getPrecoListaItens() {
        double precoTotal = 0.0;
        if (listaItems.isEmpty()) {
            return precoTotal;
        }
        for (Item item : listaItems) {
            precoTotal += (item.getPreco() * item.getQuantidade());
        }
        return precoTotal;
    }
}