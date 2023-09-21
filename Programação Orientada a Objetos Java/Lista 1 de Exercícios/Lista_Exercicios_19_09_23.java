package com.mycompany.lista_exercicios_19_09_23;
import java.util.Scanner;
public class Lista_Exercicios_19_09_23 {
    public static void main(String[] args) {
    float num1,resultado;
    Scanner input = new Scanner(System.in);
    
     /*1. Calcular e mostrar a metade de um número.*/
                            
    System.out.print("informe um número: ");
    num1 = input.nextFloat();
    resultado=(num1/2);
    System.out.println("Metado do número informado: "+resultado);
    }
}
