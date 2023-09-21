package com.mycompany.exercicio_4_calcular_retangulo_perimetro;
import java.util.Scanner; 
/*Calcular e mostrar o valor do perímetro de um retângulo dado o valor dos dois lados. 
  O perímetro do retângulo é calculado pela fórmula perimetroRetangulo = 2*lado1 + 2*lado2 */
public class Exercicio_4_Calcular_Retangulo_Perimetro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float lado1,lado2,perimetroRetangulo;
        
    System.out.print("Informe o valor do lado 1: ");
    lado1 = input.nextFloat();
     System.out.print("Informe o valor do lado 2: ");
    lado2 = input.nextFloat();
    perimetroRetangulo =((2*lado1)+(2*lado2));
    System.out.println("O valor é: "+perimetroRetangulo);
        
        
    }
}

