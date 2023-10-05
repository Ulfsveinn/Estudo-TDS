package com.mycompany.testarcliente;

public class ContaCorrente {
    private float saldo;
    private Cliente cliente;
    private static int qtdContas=0; 
    /*0 atributo estático que pertence à classe (não apenas a um objeto)
     e contabiliza todas as instâncias criadas a partir da classe,
     pode usar como "variável global" e sem ter que necessariamente criar objeto*/
    
    
   //public final int COD_OPERACAO=3; //são a mesma coisa 
   public static final int COD_OPERACAO=3;//são a mesma coisa, ele é uma constante, funciona só com final sem o static mas o padrão é colocar static final.
            
         
    public ContaCorrente() {
//        System.out.println("Nova Conta Corrente Criada!!");
        qtdContas++;
         /*se não é static a quantidade reseta a cada novo objeto, se é static ele sempre
        complementa a quantidade existente independente do objeto criado, por isso
        sendo static e chamando o getQtdContas com c1, c2, c3 ou contaCorrente ele vai
        mostrar certo de qualquer jeito*/
    }
    public static int getQtdContas(){
                return qtdContas;
                
            }
//    public int getQtdContas(){
//        return qtdContas;
//    }
   
       
    
    
}
