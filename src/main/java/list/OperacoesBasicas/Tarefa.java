package main.java.list.OperacoesBasicas;

public class Tarefa {
  //atributo
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }


  public String getDescricao() {
    return descricao;
  }

  //Para não exibir o endereço de memória da descrição
  @Override
  public String toString() {
    return  descricao;
  }
}
