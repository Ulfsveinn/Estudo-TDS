package com.mycompany.aula_dia_18_09_23_versao_prof;

import java.util.Scanner;

public class Aula_Dia_18_09_23_Versao_Prof {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();
        Scanner ler = new Scanner(System.in);// Criação de objeto scanner para função leia
       System.out.print("Informe seu nome: ");
       String nome = ler.nextLine();// Declaração de variável nome, próximo valor lido é atribuído a ela
       // Só uma palavra usar next, com espaços usar nextLine
       System.out.print("Informe sua idade:" );
       int idade = ler.nextInt();
       System.out.print("Informe seu salario: ");
       float salario =  ler.nextFloat();
       System.out.println("************************");
       System.out.println("Ficha Cadastral");
       System.out.println("Nome: "+nome);
       System.out.println("Idade: "+idade);
       System.out.println("Salario: "+salario);
       System.out.println("************************");
       System.out.println();
       System.out.print("Qual o percentual de aumento: ");
       float percentual = ler.nextFloat();
       System.out.println("Novo salario: "+(salario+(salario*percentual/100)));
       
    }
}
