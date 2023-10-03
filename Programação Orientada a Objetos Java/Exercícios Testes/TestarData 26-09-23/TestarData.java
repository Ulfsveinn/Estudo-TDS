package com.mycompany.testardata;
import java.util.Scanner;
public class TestarData {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Data data1=new Data();
        int contador=0;
       
        do{
            do{
                System.out.print("Informe o dia: ");
                data1.dia=leia.nextInt();
                if(data1.dia<1||data1.dia>31) System.out.println("Dia inválido. Informe o dia novamente!");
            }while(data1.dia<1||data1.dia>31);
            
            do{
                System.out.print("Informe o mês: ");
                data1.mes=leia.nextInt(); 
                if(data1.mes<1||data1.mes>12) System.out.println("Mês inválido. Informe o mês novamente!");
            }while(data1.mes<1||data1.mes>12);
           
            System.out.print("Informe o ano: ");
            data1.ano=leia.nextInt();
            contador++;
            data1.escreverAData();
            data1.escreverOMes();
        }while(contador<5);
        
        
        
        
        
        
    }
}
