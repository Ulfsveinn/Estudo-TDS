package com.mycompany.exercicio_5_idade_pessoas;
/*Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.*/
import java.util.Scanner;
public class Exercicio_5_idade_pessoas {
    public static void main(String[] args){
        Scanner leia=new Scanner(System.in);
        int num,menu=0,i17=0,i18=0;
        
        do{
        System.out.print("Informe sua idade: ");
        num = leia.nextInt();
        menu++;
        if(num>=18){
           i18++;
        }else{
            i17++;
        }
        }while(menu<3);
        
        System.out.println("\n"+i18+ " são maior(es) de idade.");
        System.out.println(i17+ " são menor(es) de idade.");
       
    }
}
