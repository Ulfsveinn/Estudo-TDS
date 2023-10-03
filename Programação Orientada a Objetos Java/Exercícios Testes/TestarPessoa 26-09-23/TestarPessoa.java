package com.mycompany.testarpessoa;

public class TestarPessoa {

    public static void main(String[] args) {
            Pessoa P1 = new Pessoa();

            /*----------------------------*/
            /*Escreve meu nome*/
            P1.nome="André";
            P1.DizerONome();
            /*----------------------------*/
            /*faz uma adição da minha idade em 1(20+1)*/
            P1.idade=20;
            P1.fazerAniversario();
            P1.dizerAIdade();
            /*----------------------------*/
            /*Diz minha idade*/
            P1.idade=20;
            P1.dizerAIdade();
       }
}
