package Modelo;

public class Setup {
private String nome;
private String descricao;
private int qtdArquivos;

public Setup() {
}
public Setup(String nome, String descricao, int qtdArquivos) {
    this.nome = nome;
    this.descricao = descricao;
    this.qtdArquivos = qtdArquivos;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public int getQtdArquivos() {
    return qtdArquivos;
}
public void setQtdArquivos(int qtdArquivos) {
    this.qtdArquivos = qtdArquivos;
}


}
