package com.mycompany.exercicio_4_mes;
/*Escreva um programa que leia um número entre 1 e 12 e escreva o mês correspondente. Ex: Se o
número lido for 2, deverá ser mostrado ao usuário “Fevereiro”.*/
import java.util.Scanner;
public class Exercicio_4_mes {

    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número do mês que você deseja saber o nome: ");
        num=ler.nextInt();
        System.out.println();
        switch(num){
            case 1:
            System.out.println("Janeiro");
            break;
            case 2:
            System.out.println("Feveiro");
            break;
            case 3:
            System.out.println("Março");
            break;
            case 4:
            System.out.println("Abril");
            break;
            case 5:
            System.out.println("Maio");
            break;
            case 6:
            System.out.println("Junho");
            break;
            case 7:
            System.out.println("Julho");
            break;
            case 8:
            System.out.println("Agosto");
            break;
            case 9:
            System.out.println("Setembro");
            break;
            case 10:
            System.out.println("Outubro");
            break;
            case 11:
            System.out.println("Novembro");
            break;
            case 12:
            System.out.println("Dezembro");
            break;
            default:
            System.out.println("Número invalido");
            break;
        }
            System.out.println();
 }
}

