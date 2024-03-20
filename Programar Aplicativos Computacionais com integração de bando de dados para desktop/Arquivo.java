package com.mycompany.cybercafeui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda


class Arquivo {
    

    public void gravar(String dados,String NomeArquivo) {
        try{
            FileWriter fw = new FileWriter(NomeArquivo);
            fw.write(dados);  
            fw.close();

        } catch(Exception e) {
            System.out.println("ERRO:" + e.getMessage());
        }
    }
    

    public String ler() {    
  String dadosCompletos = "";        
        try {
            FileReader fr = new FileReader("PedidoCyberCafe.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha = "";

            while(linha != null) {
                dadosCompletos += linha + "\n";
                linha = bf.readLine();
            }

        } catch(Exception e) {
            System.out.println("ERRO:" + e.getMessage());
        }

        return dadosCompletos;
    }
}