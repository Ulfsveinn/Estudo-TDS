package com.mycompany.testarfuncionario;

public class TestarFuncionario {

    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario();
        
      fun1.nome="Luis";
        fun1.sobrenome="Silva";
        fun1.horasTrabalhadas=10;
        fun1.valorPorHora=25.50;
        System.out.println("O meu nome é: "+fun1.nomeCompleto());
        System.out.println("O Calculo do meu salario é: "+fun1.calcularSalario());
        fun1.incrementarHoras(8);
        System.out.println("O Calculo do meu salario é: "+fun1.calcularSalario());
    }
}
