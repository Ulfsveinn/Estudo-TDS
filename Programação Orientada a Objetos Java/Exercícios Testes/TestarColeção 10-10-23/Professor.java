package com.mycompany.colecao;
public class Professor extends Pessoa {
    
    private double salario;

    public Professor( String nome, String endereco, int idade,double salario) {
        super(nome, endereco, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
     @Override
    public String dados(){
    String res=super.dados();
    res+=("\nSalario: "+getSalario());
    res+=("\n---------------------------------------------------------------------");

        return res;
    }
    
}
