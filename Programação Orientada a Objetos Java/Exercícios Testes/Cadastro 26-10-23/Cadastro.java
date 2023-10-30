package com.mycompany.cadastro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cadastro {

    public static void main(String[] args) {
        ArrayList<Pessoa> cadastro = new ArrayList();
        Scanner ler = new Scanner(System.in);
        boolean menu = true;
        int resposta = 0;
        String nome;
        int idade,resposta2;
        while (menu) {
            System.out.println("\n1) Cadastrar Pessoa\n2) Buscar Pessoa\n3) Fazer Aniversario\n4) Excluir Pessoa\n5) Listar Pessoa\n6) Listar Pessoas de Idade (X)\n7) Incrementar Idade\n0) Sair");
            try {
                resposta = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Informe um número valido para o menu! ");
            }
            switch (resposta) {
                
                case 1:
                    System.out.print("\nInforme o tipo de Pessoa:  1) Pessoa fisica ou 2) Pessoa Juridica: ");
                        try {
                            resposta = ler.nextInt();
                        } catch (InputMismatchException e2) {
                            System.out.println("Erro: Informe um  dos números validos! ");
                            ler.nextLine();
                            break;
                        }
                    System.out.print("Informe o Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.print("Informe a Idade: ");
                    try {
                        idade = ler.nextInt();
                    } catch (InputMismatchException in) {
                        System.out.println("Erro: Informe um número valido para a idade! ");
                        ler.nextLine();
                        break;
                    }
                        if (resposta == 1) {
                            System.out.print("\nVocê deseja informar o seu CPF? 1 - sim 2 - Não ");
                            ler.nextLine();
                              resposta2 = ler.nextInt();
                             if(resposta2==1){
                                 System.out.print("Informe o CPF: ");
                                 ler.nextLine();
                                 String cpf=ler.nextLine();
                            Pessoa p1 = new PF(cpf, nome, idade);
                            cadastro.add(p1);
                        }else{
                               Pessoa p1 = new PF(nome,idade);  
                               cadastro.add(p1);
                             }
                        }
                        if (resposta == 2) {
                             System.out.print("\nVocê deseja informar o seu CNPJ? 1 - sim");
                            ler.nextLine();
                             resposta2 = ler.nextInt();
                             if(resposta2==1){
                               System.out.print("\nInforme o seu CNPJ: ");
                            ler.nextLine();
                            String cnpj = ler.nextLine();
                            Pessoa p2 = new PJ(cnpj, nome, idade);
                            cadastro.add(p2);
                        } else if(resposta==2){
                               Pessoa p2 = new PJ(nome,idade);  
                               cadastro.add(p2);
                             }
                        }
                    break;
                case 2:
                   if (cadastro.isEmpty()) {
                           System.out.println("Nenhum cadastro encontrado");
                        } else {
                            System.out.print("\nInforme O nome da Pessoa que você deseja buscar: ");
                        ler.nextLine();
                        String nome2 = ler.nextLine();
                            for (Pessoa p : cadastro) {
                                if (p.getNome().equals(nome2)) {
                                    System.out.println("Dados Da Pessoa: ");
                                    System.out.println("Nome: "+p.getNome()+"\nIdade: "+p.getIdade());
                                }else{
                                    System.out.println("Pessoa não encontrada!");
                                }
                            }
                        }
                    break;
                     //Da o mesmo resultado do case 7, mas é feito de uma forma diferente.
                case 3:
                  if (cadastro.isEmpty()) {
                        System.out.println("Nenhum cadastro encontrado");
                    } else {
                        System.out.print("Informe o nome da pessoa:  ");
                    ler.nextLine();
                    nome = ler.nextLine();
                        for (Pessoa p : cadastro) {
                            if (p.getNome().equals(nome)) {
                                if (p instanceof PF) {
                                    ((PF) p).fazerAniversario();
                                    System.out.println("Idade Atualizada.");
                                } else {
                                    System.out.print("Informe a idade que deseja Incrementar: ");
                                    int idade3 = ler.nextInt();
                                    ((PJ) p).fazerAniversario(idade3);
                                    System.out.println("Idade incrementada.");
                                }
                            }

                        }
                    }
                    break;
                case 4:
                    if (cadastro.isEmpty()) {
                            System.out.println("Nenhum cadastro encontrado");
                        } else {
                            System.out.print("\nInforme O nome da Pessoa que você deseja Excluir: ");
                        ler.nextLine();
                        String nome3 = ler.nextLine();
                            for (Pessoa p : cadastro) {
                                if (p.getNome().equals(nome3)) {
                                    cadastro.remove(p);
                                    System.out.println("\nPessoa Excluida com Sucesso!");
                                    break;
                                }
                            }
                        }
                    break;
                case 5:
                     if (cadastro.isEmpty()) {
                            System.out.println("Nenhum cadastro encontrado");

                        } else {
                            for (Pessoa p : cadastro) {
                                if(p instanceof PJ){
                                    System.out.println( ((PJ) p).dados());
                                }else{
                                    System.out.println(((PF) p).dados());
                                }
                            }
                        }
                    break;
                case 6:
                     if (cadastro.isEmpty()) {
                            System.out.println("Nenhuma Pessoa cadastrada!");
                        } else {
                            System.out.print("Informe a idade: ");
                         idade2 = ler.nextInt();
                            for (Pessoa p : cadastro) {
                                if (p.getIdade() == (idade2)) {
                                    System.out.println(p.dados());
                                }
                            }
                        }
                    break;
                    //Da o mesmo resultado do case 3, mas é feito de uma forma diferente.
                case 7:
                    if (cadastro.isEmpty()) {
                            System.out.println("Nenhum cadastro encontrado");
                        } else {
                            System.out.print("Informe o nome da pessoa:  ");
                        ler.nextLine();
                        nome = ler.nextLine();
                            for (Pessoa p : cadastro) {
                                if (p.getNome().equals(nome)) {
                                    if (p instanceof PF) {
                                        System.out.print("Informe a idade que deseja Incrementar: ");
                                        idade2 = ler.nextInt();
                                        ((PF) p).fazerAniversario(idade2);
                                        System.out.println("Idade incrementada.");
                                        break;
                                    } else {
                                        System.out.print("Informe a idade que deseja Incrementar: ");
                                        idade2 = ler.nextInt();
                                        ((PJ) p).fazerAniversario(idade2);
                                        System.out.println("Idade incrementada.");
                                        break;
                                    }
                                }
                            }
                        }
                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    System.out.println("Resposta Inválida, Tente Novamente!");
            }
        }
            ler.close();
    }
}
