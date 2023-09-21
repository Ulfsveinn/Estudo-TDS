package com.mycompany.exercicio_2_calcular_idade;

import java.util.Scanner;

public class Exercicio_2_calcular_idade {
    public static final int ANO=2023;//isso é uma constante 
    public static void main(String[] args) {
    int resultado,Anonasc;
    Scanner input = new Scanner(System.in);

    /*2. Calcular a idade de uma pessoa, sabendo-se o ano de nascimento. */     
    
    System.out.print("Informe o seu ano de nascimento: ");
    Anonasc = input.nextInt();
    resultado=(ANO-Anonasc);
    System.out.println("sua idade é: "+resultado);
        
    }
}
