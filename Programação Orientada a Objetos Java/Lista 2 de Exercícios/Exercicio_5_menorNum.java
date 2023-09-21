package com.mycompany.exercicio_5_menornum;
/*Escreva um programa que leia 4 números e exiba qual o menor deles.*/
import java.util.Scanner;
public class Exercicio_5_menorNum {
    public static void main(String[] args) {
        int valor,valor2,valor3,valor4,menor=0;
        Scanner ler=new Scanner(System.in);
       
        System.out.print("Digite um número: ");
        valor = ler.nextInt();
        System.out.print("Digite um número: ");
        valor2 = ler.nextInt();
        System.out.print("Digite um número: ");
        valor3 = ler.nextInt();
        System.out.print("Digite um número: ");
        valor4 = ler.nextInt();
        
         menor=valor;
        if(valor2<menor){
            menor=valor2;
        }if(valor3<menor){
            menor=valor3;
        }if(valor4<menor){
            menor=valor4;
        }
         System.out.println("o número menor é: "+menor);
    }
}
