package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (tarefasSet.isEmpty()) {
            throw new RuntimeException("A lista de tarefas está  vazia!");
        }

        Tarefa tarefaParaRemover = null;
        //Busca pela palavra
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        //Remove a tarefa
        if (tarefaParaRemover != null) {
            tarefasSet.remove(tarefaParaRemover);
            System.out.println("Tarefa com a descrição: '" + descricao + "' removida.");
        } else {
            System.out.println("Tarefa com a descriçao: '" + descricao + "' não encontrada.");
        }
    }

    public void exibirTarefas() {
        if (tarefasSet.isEmpty()) {
            throw new RuntimeException("A lista de tarefas está  vazia!");
        } else {
            System.out.println(tarefasSet);
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public void marcarTarefaConcluida(String descricao) {
        if (tarefasSet.isEmpty()) {
            throw new RuntimeException("A lista de tarefas está  vazia!");
        }
        boolean encontrou = false;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                System.out.println("Tarefa com a descriçao: '" + descricao + "' marcada como concluída.");
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Tarefa com a descriçao: '" + descricao + "' não encontrada.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (tarefasSet.isEmpty()) {
            throw new RuntimeException("A lista de tarefas está  vazia!");
        }
        boolean encontrou = false;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                System.out.println("Tarefa com a descriçao:'" + descricao + "' marcada como pendente.");
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Tarefa com a descriçao: '" + descricao + "' não encontrada.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
        System.out.println("Lista de tarefas limpa.");
    }
}