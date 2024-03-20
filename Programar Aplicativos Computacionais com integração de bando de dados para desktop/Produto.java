package com.mycompany.cybercafeui;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda

public class Produto {
    
    private int id;
    private String nome;
    private float valor;
    private char tipo;
    
    public Produto(String nome, float valor,char tipo) {
        this.nome=nome;
        this.valor=valor;
        this.tipo=tipo;
    }
    
    public int getId() {
        return id;
    }
    public void setId() {
        this.id=id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome=nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor() {
        this.valor=valor;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo() {
        this.tipo=tipo;
    }
}
