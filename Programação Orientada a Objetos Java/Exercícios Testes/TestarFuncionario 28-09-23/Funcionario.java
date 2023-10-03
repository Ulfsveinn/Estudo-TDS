package com.mycompany.testarfuncionario;

public class Funcionario {
    
    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public double valorPorHora;


    public String nomeCompleto(){
        return nome+" "+sobrenome;
    }
    public double calcularSalario(){
        return horasTrabalhadas*valorPorHora;
    }
    public void incrementarHoras(int valor){
        horasTrabalhadas+=valor;
        
    }
}
