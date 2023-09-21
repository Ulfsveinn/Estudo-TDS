package com.mycompany.exercicio_1num_maior_menor_zero;
/*1. Ler um número e determinar se ele é maior ou igual ou menor do que zero*/
import java.util.Scanner;
public class Exercicio_1Num_maior_menor_zero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Informe sua o valor que você deseja: ");
        numero = ler.nextInt();
        
        if(numero>0){
            System.out.println("O número é maior que zero!!");
        }
        else if(numero==0){
            System.out.println("O número é igual a zero!!");
        }else{
            System.out.println("O número é menor que zero!!");
        }
        
        
        
    }
}
