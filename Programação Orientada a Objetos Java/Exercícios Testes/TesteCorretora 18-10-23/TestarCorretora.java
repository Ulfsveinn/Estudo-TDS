package com.mycompany.testarcorretora;

import java.util.Scanner;
import java.util.ArrayList;

public class TestarCorretora {

    public static void main(String[] args) {
        ArrayList<Imovel> Cadastro = new ArrayList();
        Scanner ler = new Scanner(System.in);
        boolean menu = true;
        String tipo;
        int resposta;
        while (menu) {
            System.out.print("1) Cadastrar Casa\n"
                    + "2) Cadastrar Apto\n"
                    + "3) Cadastrar Terreno\n"
                    + "4) Listar imóveis\n"
                    + "0) Sair\nEscolha sua opção: ");

            resposta = ler.nextInt();
            switch (resposta) {
                case 1:
                    System.out.print("Informe o Endereço: ");
                    ler.nextLine();
                    String end = ler.nextLine();
                    System.out.print("Informe o valor da casa: ");
                    float valorcasa = ler.nextFloat();
                    System.out.print("Informe A Area Total: ");
                    float area = ler.nextFloat();
                    System.out.print("Informe A Area Construida: ");
                    float areaconstruida = ler.nextFloat();
                    Imovel casa = new Casa(valorcasa, end, area, areaconstruida);
                    casa.setEndereco(end);
                    casa.setValor(valorcasa);
                    casa.setAreaTotal(area);
                    Cadastro.add(casa);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Informe o Endereço: ");
                    ler.nextLine();
                    String endapto = ler.nextLine();
                    System.out.print("Informe o valor do apto: ");
                    float valorapto = ler.nextFloat();
                    System.out.print("Informe A Area Total: ");
                    float areatotalapto = ler.nextFloat();
                    System.out.print("Informe A Area Privativa: ");
                    float areaprivativa = ler.nextFloat();
                    Imovel apto = new Apto(valorapto, endapto, areatotalapto, areaprivativa);
                    apto.setValor(valorapto);
                    apto.setEndereco(endapto);
                    apto.setAreaTotal(areatotalapto);
                    Cadastro.add(apto);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Informe o Endereço: ");
                    ler.nextLine();
                    String endterrn = ler.nextLine();
                    System.out.print("Informe o valor do Terreno: ");
                    float valorterrn = ler.nextFloat();
                    System.out.print("Informe A Area Total: ");
                    float areatotalterrn = ler.nextFloat();
                    do {
                        System.out.print("Informe o tipo de terreno(Urbano ou Rural): ");
                        tipo = ler.next();
                        tipo = tipo.toUpperCase();
                        if (!tipo.equals("RURAL") && !tipo.equals("URBANO")) {
                            System.out.println("Tente novamente!");
                        }
                    } while (!tipo.equals("RURAL") && !tipo.equals("URBANO"));
                    Imovel terreno = new Terreno(valorterrn, endterrn, areatotalterrn, tipo);
                    terreno.setValor(valorterrn);
                    terreno.setEndereco(endterrn);
                    terreno.setAreaTotal(areatotalterrn);
                    terreno.calculariptu(areatotalterrn);
                    System.out.println("Cadastro Concluido!");
                    Cadastro.add(terreno);
                    break;
                case 4:
                    if (Cadastro.isEmpty()) {
                    } else {
                        for (Imovel i : Cadastro) {
                            System.out.println(i.infoimovel());
                        }
                    }
                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    System.out.println("Número Inválido!");
                    break;
            }
        }
    }
}
