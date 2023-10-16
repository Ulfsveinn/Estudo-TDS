package com.mycompany.testaragenda;
public class Agenda{
    private String nome;
    private Contato contato;

    
    public Contato getContato() {
        return contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
   
    
   
}
