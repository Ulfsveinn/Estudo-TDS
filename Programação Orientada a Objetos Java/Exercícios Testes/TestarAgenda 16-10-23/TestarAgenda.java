package com.mycompany.testaragenda;
import java.util.ArrayList;
import java.util.Scanner;
public class TestarAgenda {

    public static void main(String[] args) {
        int i;
        String nome,email,nomeagenda;
        Scanner ler = new Scanner(System.in);
     
      
      ArrayList<Contato> cadastroC = new ArrayList();
      
            Agenda agenda = new Agenda();
            
          System.out.print("Informe o nome da Agenda: ");
           nomeagenda = ler.nextLine();
           agenda.setNome(nomeagenda);
      for(i=1;i<4;i++){
          System.out.println("Cadastro do contato: "+i+"/3");
         Contato contato = new Contato();  
          System.out.print("\nInforme o nome: ");
          nome = ler.nextLine();
          contato.setNomepessoa(nome);
          
          System.out.print("Informe o email: ");
          email = ler.nextLine();
          contato.setEmail(email);
          
          Telefone telefones = new Telefone();
          System.out.print("Informe o ddd: ");
          String ddd = ler.nextLine();
          telefones.setDdd(ddd);
          System.out.print("Informe o numero: ");
          String numero = ler.nextLine();
          telefones.setNumero(numero);
          System.out.print("Informe o tipo: ");
          String tipo = ler.nextLine();
          telefones.setTipo(tipo);     
            contato.setTelefones(telefones);
            //Criar uma forma de adicionar de numeros a mais.
            
//          System.out.print("\nGostaria de informar outro telefone: ");
//          ler.nextLine();
//          String resposta = ler.nextLine();
//          if(resposta=="s"){
//           Telefone telefones2 = new Telefone();
//            System.out.print("\nInforme o ddd: ");
//          String ddd2 = ler.nextLine();
//          telefones.setDdd(ddd2);
//          System.out.print("\nInforme o numero: ");
//          String numero2 = ler.nextLine();
//          telefones.setNumero(numero2);
//          System.out.print("\nInforme o tipo: ");
//          String tipo2 = ler.nextLine();
//          telefones.setTipo(tipo2);     
//            contato.setTelefones(telefones2);
//          }
         cadastroC.add(contato);
      }
      if(cadastroC.isEmpty()){
      }else{
           System.out.println("\n"+agenda.getNome());
          for(Contato c: cadastroC){
              System.out.println("\nNome: "+c.getNomepessoa()+"\nEmail: "+c.getEmail()+"\nDDD: "+c.getTelefones().getDdd()+"\nNúmero: "+c.getTelefones().getNumero()+"\nTipo: "+c.getTelefones().getTipo());
             
          }
      }
        
    }
}
