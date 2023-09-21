package com.mycompany.exercicio_3_calcular_retangulo;
import java.util.Scanner;
public class Exercicio_3_Calcular_Retangulo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float lado1,lado2,areaRetangulo;
    /*Calcular e mostrar o valor da área de um retângulo dado o valor dos dois lados. a área do rêtangulo é calculada pela fórmula dica: areaRetangulo=lado1 * lado2*/
    
    System.out.print("Informe o valor do lado 1: ");
    lado1 = input.nextFloat();
     System.out.print("Informe o valor do lado 2: ");
    lado2 = input.nextFloat();
    areaRetangulo=lado1*lado2;
    System.out.println("O valor é: "+areaRetangulo);
    }
}
