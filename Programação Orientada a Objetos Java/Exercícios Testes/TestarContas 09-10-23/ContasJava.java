
package com.mycompany.contas.java;
import java.util.Scanner;

public class ContasJava {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        ContaBancaria c1 = new ContaBancaria("André",1,0f);
        ContaPoupança c2 = new ContaPoupança("Luis",2,100f,20);
        ContaEspecial c3 = new ContaEspecial("José",3,100f,1000f);

        
       
            System.out.println(c1.dados());
        System.out.println("----------------------------------------------------------");
        System.out.print("informe o valor do deposito: ");
            float num2 =ler.nextFloat();
            c1.depositar(num2);
        System.out.println("----------------------------------------------------------");
        System.out.print("informe o valor do saque: ");
            float num =ler.nextFloat();
            c1.sacar(num);
        System.out.println("----------------------------------------------------------");
            System.out.println(c1.dados());
        System.out.println("----------------------------------------------------------");
            System.out.println(c2.dados());
        System.out.println("----------------------------------------------------------");
        System.out.print("Informe a porcentagem da taxa: ");
            float num3 =ler.nextFloat();    
            c2.calcularNovoSaldo(num3);
        System.out.println("----------------------------------------------------------");
            System.out.println(c2.dados());
        System.out.println("----------------------------------------------------------");
        System.out.print("Informe o valor do saque: ");
            float num4 =ler.nextFloat();
            c3.sacarComLimite(num4);
        System.out.println("----------------------------------------------------------");
            System.out.println(c3.dados());
        System.out.println("----------------------------------------------------------");
       
   
       

    }
}
