package com.mycompany.testardata;

public class Data {
    
    public int dia;
    public int mes;
    public int ano;


    public void escreverAData(){
        if(dia<10)System.out.print("0"+dia+"/");
        else System.out.print(dia+"/");
        
        if(mes<10) System.out.print("0"+mes+"/");
        else System.out.print(mes+"/");
        System.out.println(ano);
    }
    public void escreverOMes(){
        switch (mes) {
            
            case 1:
                System.out.println("Janeiro");
            break;
            case 2: 
                System.out.println("Fevereiro");
            break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5: System.out.println("Maio");
            break;
            case 6: System.out.println("Junho");
            break;
            case 7: System.out.println("Julho");
            break;
            case 8: System.out.println("Agosto");
            break;
            case 9: System.out.println("Setembro"); 
            case 10: System.out.println("Outubro");
            break;
            case 11: System.out.println("Novembro");
            break;
            case 12: System.out.println("Dezembro");
            break;
        }
            
    }
        
            
   }

