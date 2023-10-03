package com.mycompany.testarpessoa;

public class Pessoa {
    public String nome;
    public int idade;
    
    public void DizerONome(){
        System.out.println("Olá, meu nome é "+this.nome);
}
    public void dizerAIdade(){
        System.out.println("Olá, eu tenho "+this.idade+" anos");
    }
    public void fazerAniversario(){
        idade+=1;
    }
}
