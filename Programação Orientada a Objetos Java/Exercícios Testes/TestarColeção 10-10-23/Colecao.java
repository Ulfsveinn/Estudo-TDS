package com.mycompany.colecao;
import java.util.Scanner;
import java.util.ArrayList;//uma biblioteca que cria uma lista e armazena as informações sem apagar a anterior.
import java.util.List;
public class Colecao {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
       
        Professor prof1;
        boolean menu=true;
        String nome,endereco;
        int idade;
       ArrayList<Professor> cadastroP = new ArrayList();
         //List<Professor> cadastroP = new ArrayList<>();
        ArrayList<Aluno> cadastroA = new ArrayList();
        double salario;      
        do{
            System.out.println("1 - Cadastrar Professor \n2 - Cadastrar Aluno \n3 - Exibir Professores \n4 - Exibir Alunos\n5 - Editar nome Professor\n6 - Editar nome Aluno\n7 - Excluir Professor\n0 - Sair \nEscolher: ");
            int opcao = ler.nextInt();
            
            switch(opcao){
                
                case 1:
                    System.out.print("\nInforme o Nome do Professor: ");
                     ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("\nInforme o Endereço do Professor: ");
                     endereco = ler.nextLine();
                    System.out.print("\nInforme a Idade do Professor: ");
                     idade = ler.nextInt();
                    System.out.print("\nInforme o Salario do Professor: ");
                     salario = ler.nextFloat();
                    prof1 = new Professor(nome,endereco,idade,salario);
                  cadastroP.add(prof1);
                    System.out.println("\nCadastro realizado com sucesso!");
                    break;
                case 2: 
                System.out.print("\nInforme o Nome do Aluno: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                System.out.print("\nInforme o Endereço do Aluno: ");
                     endereco = ler.nextLine();
                System.out.print("\nInforme a Idade do Aluno: ");
                     idade = ler.nextInt();
                System.out.print("\nInforme a Nota 1 do Aluno: ");
                   double nota1 = ler.nextDouble();
                   System.out.print("\nInforme a Nota 1 do Aluno: ");
                   double nota2 = ler.nextDouble();
                   System.out.print("\nInforme a Nota 1 do Aluno: ");
                   double nota3 = ler.nextDouble();
                    Aluno Al1 = new Aluno(nome,endereco,idade,nota1,nota2,nota3);
                    cadastroA.add(Al1);
                    System.out.println("\nCadastro realizado com sucesso!");
                break;
                case 3: 
                   if(cadastroP.isEmpty()){
                       System.out.println("Nenhum Professor Cadastrado!");
                   }else
                       for(Professor p: cadastroP){
                           System.out.println(p.dados());// dentro desse "for" vc ira procurar os dados cadastrados.
                       }
                break;
                case 4: 
                  if(cadastroA.isEmpty()){
                      System.out.println("Nenhum Aluno Cadastrado!");
                  }else{
                      for(Aluno a: cadastroA){
                           System.out.println(a.dados());
                        
                          
                      }
                  }
                break;
                case 5:
                  System.out.print("\nInforme o Nome do Professor que ira editar: ");
                  ler.nextLine();
                  nome = ler.nextLine();
                 for(Professor p: cadastroP){
                  if(p.getNome().equals(nome)){
                      System.out.println("Informe o novo nome do professor: ");
                      nome = ler.nextLine();
                    p.setNome(nome);
                      System.out.println("Editado com Sucesso!!");
                 } else {
                      System.out.println("Nome não encontrado, tente novamente!");
                }
                 }
                break;
                
                case 6:
                    System.out.println("\nInforme o Nome do Aluno que ira editar:  ");
                    ler.nextLine();
                    nome=ler.nextLine();
                    for(Aluno a: cadastroA ){
                        if(a.getNome().equals(nome)){
                            System.out.println("Informe o novo nome do Aluno: ");
                      nome = ler.nextLine();
                    a.setNome(nome);
                      System.out.println("Editado com Sucesso!!");
                        }
                    }
                    break;
                case 7:
                    System.out.print("\nInforme o Nome do Professor que ira excluir: ");
                  ler.nextLine();
                  nome = ler.nextLine();
                 for(Professor p: cadastroP){
                  if(p.getNome().equals(nome)){
                     cadastroP.remove(p);
                      System.out.println("Professor excluido!");
                     break;
                  }else{
                      System.out.println("Nome inválido");
                  }
                 }
                  break;
                case 0:
                    menu=false;
                break;
                default: System.out.println("Opção Inválida!!");
            }
        }while(menu);
        
        
        
    }
}

//                  ArrayList<Professor> professoresParaExcluir = new ArrayList();
//        for (Professor p : cadastroP) {
//            if (p.getNome().equals(nome)) {
//                professoresParaExcluir.add(p);
//            }
//        }
//        if (!professoresParaExcluir.isEmpty()) {
//            // Remova os professores marcados para exclusão
//            cadastroP.removeAll(professoresParaExcluir);
//            System.out.println("Professor excluido!");
//            
//        } else {
//            System.out.println("Nenhum professor encontrado com o nome informado.");
//        }