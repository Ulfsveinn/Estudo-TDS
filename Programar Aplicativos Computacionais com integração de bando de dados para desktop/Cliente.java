package com.mycompany.cybercafeui;
import java.time.LocalDate;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda

public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private char tipo;
    private String ddd;
    private String numero;

    public Cliente(String nome, String cpf, LocalDate dataNasc, char tipo, String ddd, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    //Criar métodos para ligação com banco de dados
    
}
