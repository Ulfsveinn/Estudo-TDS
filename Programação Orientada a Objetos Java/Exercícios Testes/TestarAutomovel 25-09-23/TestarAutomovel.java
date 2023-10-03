package com.mycompany.testarautomovel;
import java.util.Scanner;
public class TestarAutomovel {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Automovel car1 = new Automovel();
        int vel;
        car1.cor="Branco";
        car1.marca="Peugeot";
         car1.buzinar();// aqui chama o método
        car1.modelo="3008 GP";
        car1.velocidade=0;
        /*----------------------------------------------------------------*/
        System.out.print("informe em quanto você quer acelerar peugeot? ");
        vel = ler.nextInt();
        car1.acelerar(vel);
        System.out.println("Velocidade do carro: "+car1.velocidade+" km/h");
        //a linha que chama é a mesma que recebe.
        car1.reduzir(50);
        System.out.println("Velocidade do carro: "+car1.reduzir(50)+" km/h");
        /*----------------------------------------------------------------*/
        System.out.println("------------------------------------------");
        System.out.println("Marca do carro: "+car1.marca);
        System.out.println("Modelo do carro: "+car1.modelo);
        System.out.println("Cor do carro: "+car1.cor);
        //System.out.println("Velocidade do carro: "+car1.velocidade+" km/h");
        System.out.println("------------------------------------------"); 
        /*----------------------------------------------------------------*/
       /* Automovel car2 = new Automovel();
        car2.cor="Preto";
        car2.marca="Vw";
        car2.modelo="Golf";
        car2.velocidade=0;*/
        /*----------------------------------------------------------------*/
       /* System.out.print("informe em quanto você quer acelerar Golf? ");
        vel = ler.nextInt();
        car2.acelerar(vel);*/
        /*----------------------------------------------------------------*/
        /*System.out.println("Marca do carro: "+car2.marca);
        System.out.println("Modelo do carro: "+car2.modelo);
        System.out.println("Cor do carro: "+car2.cor);
        System.out.println("Velocidade do carro: "+car2.velocidade+" km/h");
        System.out.println("------------------------------------------");*/

      
        
    }
    
}
