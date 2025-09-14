package main.java.list.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        List<Integer> listaAscendente = new ArrayList<>(this.numerosList);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }
    public List<Integer> ordenarDescendente() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        List<Integer> listaDescendente = new ArrayList<>(this.numerosList);
        listaDescendente.sort(Collections.reverseOrder());
        return listaDescendente;
    }

    public void exibirNumeros() {
        if (numerosList.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println(this.numerosList);
        }
    }
    }
