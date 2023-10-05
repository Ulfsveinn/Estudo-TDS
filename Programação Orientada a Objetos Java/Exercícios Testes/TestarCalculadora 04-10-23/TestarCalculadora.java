package com.mycompany.testarcalculadora;
/*1 - Faça uma classe Calculadora que realize as 4 operações
matemáticas básicas (soma, divisão, multiplicação e
subtração) através de métodos estáticos, sobre dois valores
(double) passados como parâmetros e retorne o resultado.
Crie um programa que realize as 4 operações e imprima os
resultados obtidos.*/
import java.util.Scanner;
public class TestarCalculadora {
    public static void main(String[] args) {
        int num1,num2,num;
        boolean menu=true;
        Scanner leia = new Scanner(System.in);
        Calculadora conta1 = new Calculadora();
        System.out.println("Digite um número: ");
        num1=leia.nextInt();
        System.out.println("Digite um número: ");
        num2=leia.nextInt();
        System.out.println("1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n0 - sair\nEscolha sua forma de calculo: ");
        num=leia.nextInt();
        while(menu){
            switch(num){
                case 1:
                    System.out.println("Resultado: "+Calculadora.somar(num1, num2));
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                 case 0:
                    menu=false;
                break;
            }
        }
    }
}
