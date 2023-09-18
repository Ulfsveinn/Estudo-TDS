package com.mycompany.aula_dia_18_09_23_exercicios;
import java.util.Scanner;
public class Aula_dia_18_09_23_Exercicios {

    public static void main(String[] args) {
        //Exercício 1
        System.out.println("Hello World!");
        System.out.println("O Primeiro Programa a gente nunca esquece!");
        //Exercício 2
        System.out.println("Nome: André Luis Mesquita Barbosa Júnior");
        System.out.println("Endereço: Rua Lopes Mendes 12");
        System.out.println("Cep: 24358310");
        System.out.println("Telefone: (51)99330-7083");
        System.out.println();
        //Exercício 3 Implemente um programa que desenhe um Quadrado na tela
       
       int i,j;
        
        for(i=0; i< 5; i++){
            for(j=0; j < 10; j++){
                System.out.print("a");
                System.out.print(" ");
            }
                    System.out.println();
        }
                System.out.println();

        for(i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 5 - 1 || j == 5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
        }   
                System.out.print(" ");
            }
            System.out.print("\n");
        } 
                System.out.println();

        //Exercício 4 Implemente um programa que desenhe um "pinheiro" na tela
        
        int altura = 10;// Definir a altura do pinheiro
        char simbolo = '*';// Definir o caractere para desenhar o pinheiro
        int espaco = altura - 1; // Definir o espaçamento inicial
        for ( i = 1; i <= altura; i++) /* Usar um laço for para desenhar cada linha do pinheiro*/ {
            for (j = 1; j <= espaco; j++)/* Usar outro laço for para desenhar os espaços em branco antes do pinheiro*/{
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++)/* Usar outro laço for para desenhar os símbolos do pinheiro*/{
                System.out.print(simbolo);
            }  
            espaco--;// Diminuir o espaçamento em uma unidade
            System.out.println();// Pular para a próxima linha
        }
        System.out.printf("%" + altura + "s\n", "|");// Desenhar o tronco do pinheiro usando printf
        System.out.println();
        
        
        //Exercício 5 Tabela de notas - Escreva um programa que produza a seguinte saída na tela
        System.out.println("Aluno       Nota");
        System.out.println("====        ====");
        System.out.println("Aline       9.0\nMÁRIO       DEZ\nSÉRGIO      4.5\nSHIRLEY     7.0");
      
    
       
    }
        
        
    }

