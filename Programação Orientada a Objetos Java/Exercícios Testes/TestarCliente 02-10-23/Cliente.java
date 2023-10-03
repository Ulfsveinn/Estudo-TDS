package com.mycompany.testarcliente;
public class Cliente {
    
    private String nome;
    private String endereco;
    private float renda;
    
    //construtor com nome e endereço e renda.
    public Cliente(String nome, String endereco,float renda){
        this.nome=nome;
        this.endereco=endereco;
        this.renda=renda; 
        System.out.println("Cliente criado com sucesso!!");
    }
    
    //construtor com apenas nome  e endereço mas a renda inicial sempre sera 1000 por padrão.
    public Cliente(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
        this.renda=1000.00f; // você pode fixar um valor ou nome e etc ex: this.renda=1000.00f; o "f" é usado para definir que é float para o java não trocar por double.
        System.out.println("Cliente criado com sucesso!!");
    }
    
    //construtor com apenas para o nome.
    public Cliente(String nome){
        this.nome=nome;
        System.out.println("Cliente criado com sucesso!!");
    }
    
    //método acessor
    public String getNome(){
        return nome;
    }
    //método modificador
    public void setNome(String nome){
        this.nome=nome;
    }
    //método acessor
    public String getEndereco(){
        return endereco;
    }
    //método modificador
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
     //método acessor
    public float getRenda(){
        return renda;
    }
    //método modificador
    public void setRenda(float renda){
        this.renda=renda;
    }
    
}
