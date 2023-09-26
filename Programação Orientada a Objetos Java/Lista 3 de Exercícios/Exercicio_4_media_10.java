package com.mycompany.exercicio_4_media_10;
/*Calcular a média de 10 números informados pelo usuário. */
import java.util.Scanner;
public class Exercicio_4_media_10 {
    public static void main(String[] args){
        int num=0,i;
        float resultado,media=0;
        Scanner leia =  new Scanner(System.in);
        for(i=0;i<10;i++){
        System.out.print("informe um valor: ");
        num = leia.nextInt();
        media+=num;
        }
        System.out.print("Soma total: "+media);
        resultado=media/10;
        System.out.println("\nA média é: "+resultado);

    }
}
