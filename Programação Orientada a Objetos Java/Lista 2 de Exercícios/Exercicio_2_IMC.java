package com.mycompany.exercicio_2_imc;
/*Faça um programa que leia o índice de massa corporal (IMC) de uma pessoa. Se o valor do IMC for
maior do que 25,0 deverá ser exibida a mensagem “Você está acima do peso!”. Caso contrário exiba
a mensagem “Você está saudável!”. */
import java.util.Scanner;
public class Exercicio_2_IMC {

    public static void main(String[] args) {
        float altura,imc;
        int peso;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        peso=ler.nextInt();
        System.out.print("Informe sua altura: ");
        altura=ler.nextFloat();
        
        imc=(peso/(altura*altura));
        
        if(imc>=25.0){
            System.out.println("Você está acima do peso ideal.");
        }else if((imc>=18.5)&&(imc<=24.9)){
            System.out.println("Você está com peso ideal.");
        }else{
            System.out.println("Você está abaixo do peso ideal.");
        }
    }
}
