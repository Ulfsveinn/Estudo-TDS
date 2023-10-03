package com.mycompany.testarcontacorrente;

import java.util.Scanner;

public class TestarContaCorrente {
    public static void main(String[] args){
        Conta pessoa1= new Conta();
        Scanner leia =new Scanner(System.in);
        float num,num2;
        int answer;
        boolean menu=true;
       System.out.println("1 - depositar\n2 - sacar\n3 - saldo\n0 - sair");
       answer = leia.nextInt();

       pessoa1.DefinirSaldoAtual(1000);
       
       System.out.println("Saldo atual: "+pessoa1.saldo);
        while(menu){

       switch(answer){
        case 1:
        do{
        System.out.print("Informe o valor do deposito:  ");
        num2=leia.nextFloat();
        pessoa1.depositar(num2);
        }while(pessoa1.saldo<=0.0);

       
        case 2:
        System.out.print("informe o valor do saque: ");
        num=leia.nextFloat();
        while (num<=0){
            System.out.print("Informe o valor novamente: ");
            num=leia.nextFloat(); 
        }
        pessoa1.sacar(num);
        if(num<pessoa1.saldo){
            System.out.println("você sacou: "+num);
        }else{
            System.out.println("Saldo insuficiente!!");
        }
        case 3:
         System.out.println("Saldo atual "+pessoa1.saldo);
        break;
        
        case 0:
        menu=false;
        break;
       }
    }
       
        
        
        
        
         
       
        
        leia.close();
    }
}
