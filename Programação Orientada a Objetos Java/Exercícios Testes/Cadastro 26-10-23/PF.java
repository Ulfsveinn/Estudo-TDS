package com.mycompany.cadastro;

public class PF extends Pessoa implements Aniversario {

    private String cpf;

    public PF(String cpf, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public PF(String nome, int idade) {
        super(nome, idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }

    @Override
    public void fazerAniversario(int aniver) {
        setIdade(getIdade() + aniver);
    }

    @Override
    public String dados() {
        String b = super.dados();
        if(getCpf()!=null) b+=("\nCPF: "+getCpf());
        else{
           b+=("\nCPF não cadastrado!");
        }
        return b;
    }

}
