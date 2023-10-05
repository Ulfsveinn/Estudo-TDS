package com.mycompany.testarcliente;
import java.util.Scanner;

public class TestarCliente {
    public static void main(String[] args) {
         // Cliente c1=new Cliente("Andre","rua 1,bairro 1",1212); informação com construtor
        Scanner ler = new Scanner(System.in);
        //c1.nome="André"; O atributo privado não aceita ser chamado, mas como o método é publico ele aceita.
        
        
        
        System.out.print("Informe o nome: ");
        String nome = ler.nextLine();
      //  c1.setNome(nome);
        
        System.out.print("Informe o endereço: ");
        String endereco = ler.nextLine();
      //  c1.setEndereco(endereco);
       
        System.out.print("Informe o renda: ");
        float renda = ler.nextFloat();
        //c1.setRenda(renda);
        Cliente c1=new Cliente(nome,endereco,renda); //informação com construtor
        Cliente c2=new Cliente("frederico","rua 2,bairro 2",1212);
        Cliente c3=new Cliente("joao");
        Cliente c4=new Cliente("luis","rua 3,bairro 3",5600.0f);
        System.out.println("-----------------------------------------------");
        System.out.println("o meu nome é: "+c1.getNome());
        System.out.println("O meu endereço é: "+c1.getEndereco());
         System.out.println("sua renda é: "+c1.getRenda());
                 System.out.println("-----------------------------------------------");

        System.out.println("o meu nome é: "+c2.getNome());
        System.out.println("O meu endereço é: "+c2.getEndereco());
         System.out.println("sua renda é: "+c2.getRenda());
                 System.out.println("-----------------------------------------------");

        System.out.println("o meu nome é: "+c3.getNome());
        System.out.println("O meu endereço é: "+c3.getEndereco());
         System.out.println("sua renda é: "+c3.getRenda());
                 System.out.println("-----------------------------------------------");

        System.out.println("o meu nome é: "+c4.getNome());
        System.out.println("O meu endereço é: "+c4.getEndereco());
         System.out.println("sua renda é: "+c4.getRenda());

        ContaCorrente cc1 = new ContaCorrente();
              // - aqui eu chamei um objeto da classe, dá certo, explicado no método
        //System.out.println("Quantidades: "+cc1.getQtdContas());
           // ContaCorrente cc2 = new ContaCorrente();
        //System.out.println("Quantidades: "+cc2.getQtdContas());
            //ContaCorrente cc3 = new ContaCorrente();
        //System.out.println("Quantidades: "+cc3.getQtdContas());
            
            ContaCorrente cc4 = new ContaCorrente(); 
            ContaCorrente cc5 = new ContaCorrente(); 
            
            //int x = ContaCorrente.getQtdContas();
            // - aqui eu chamei a classe toda e atribuí o valor à variável x
            System.out.println("Quantidade: "+ContaCorrente.COD_OPERACAO);
         
    }
}
