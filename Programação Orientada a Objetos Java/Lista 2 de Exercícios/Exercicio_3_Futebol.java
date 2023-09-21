package com.mycompany.exercicio_3_futebol;
/*Escreva um programa para ler o nome de dois times de futebol e o número de gols marcados por
cada time na partida. O programa deve imprimir o nome do time vencedor. Caso não haja vencedor
deverá ser impresso EMPATE. 
*/
import java.util.Random; 
import java.util.Scanner;
public class Exercicio_3_Futebol {

    public static void main(String[] args){
        Random gerador = new Random();
        Scanner ler =new Scanner(System.in);
        int num = gerador.nextInt(10); //cria numeros aleatórios
        int num2 = gerador.nextInt(10);
        
        System.out.print("Digite o nome do time 1: ");
        String time1 = ler.nextLine();
        System.out.print("Digite o nome do time 2: ");
        String time2 = ler.nextLine();    
        System.out.println();
        System.out.println("O time "+time1+" fez "+num+" gol(s)!!");
        System.out.println("O time "+time2+" fez "+num2+" gol(s)!!");     
        System.out.println();
        if(num>num2){
            System.out.println(time1+" Ganhou  por "+num+" a "+num2+" !!");
            System.out.println();
        }else if(num2>num){
            System.out.println(time2+" Ganhou por "+num2+" a "+num+" !!");
            System.out.println();
        }else{
            System.out.println("EMPATOU por "+num+" a "+num2+" !!");
        }
            
    }
}