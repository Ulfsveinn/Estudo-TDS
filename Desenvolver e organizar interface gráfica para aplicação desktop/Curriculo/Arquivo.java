package com.mycompany.curriculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo {
    String concat="";
        public void gravar(String dados){
              try{
            FileWriter fw = new FileWriter("Curriculo.txt");
            fw.write("Curriculo");
            concat+=dados;
            fw.write(concat);
             fw.close();
            }	
            catch(Exception e){
            System.out.println("ERRO:" + e.getMessage());
        }
        }

        public String ler(){
             try{
                 concat="";
            FileReader fr = new FileReader("Curriculo.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha= bf.readLine();
            System.out.println(linha);
            while(linha!=null){
                  System.out.println(linha);
                  concat+=linha+"\n";
                linha = bf.readLine();
            }  
            }catch(Exception e){
            System.out.println("ERRO:" + e.getMessage());
            }
             return concat;
 }
}


            
