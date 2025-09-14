package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;
//  Implemente os seguintes métodos:
    public SomaNumeros(){
        listaInteiros = new ArrayList<>();
    }
    public List<Integer> adicionaNumeros(int n) {
        listaInteiros.add(n);
        return listaInteiros;
    }
    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }
    public Integer getMaiorNumero() {
        if (listaInteiros.size() <= 0){
            throw new RuntimeException("A lista está vazia!");
        }
        Integer maior = Integer.MIN_VALUE;
        for (Integer integer : listaInteiros) {
            if (integer > maior) {
                maior = integer;
            }
        }
        return maior;
    }
    public Integer getMenorNumero() {
        if (listaInteiros.size() <= 0){
            throw new RuntimeException("A lista está vazia!");
        }
        Integer menor = Integer.MAX_VALUE;
        for (Integer integer : listaInteiros) {
            if (integer < menor) {
                menor = integer;
            }
        }
        return menor;

    }
    public Integer getSomaNumeros() {
        if (listaInteiros.size() <= 0){
            throw new RuntimeException("A lista está vazia!");
        }
        Integer soma = 0;
        for (Integer integer : listaInteiros) {
            soma += integer;
        }
        return soma;
    }
}
