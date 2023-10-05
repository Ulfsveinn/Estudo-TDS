package com.mycompany.testeempregadoo;

import java.util.Scanner;

public class TesteEmpregadoo {
public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
        
        
        System.out.print("informe o seu nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Informe o seu sobrenome: ");
       String sobrenome=leia.nextLine();
        
        System.out.print("informe o seu salario: ");
       Double salarioMensal = leia.nextDouble();
        System.out.println("\n--------------------------------------------------------\n");
        Empregado work0 = new Empregado(nome, sobrenome,salarioMensal);
        
        System.out.println("Olá "+work0.getNome()+" "+work0.getSobrenome()+" seja bem vindo, o seu salario é de: "+work0.getSalario());
        System.out.println("o seu salario anual é: "+work0.salarioAnual());
        System.out.print("Quanto de porcento de desconto você gostaria? ");
       double num = leia.nextDouble();
       work0.aumento(num);
        
         System.out.println("o seu salario ficou em: "+work0.getSalario());
         Empregado work1 = new Empregado("André","Luis",5000.00);
         work1.dados();
         System.out.println("o seu salario anual é: "+work1.salarioAnual());
         System.out.print("Quanto de porcento de desconto você gostaria? ");
         double num2 = leia.nextDouble();
        work1.aumento(num2);
         System.out.println("o seu salario ficou em: "+work1.getSalario());
}
}