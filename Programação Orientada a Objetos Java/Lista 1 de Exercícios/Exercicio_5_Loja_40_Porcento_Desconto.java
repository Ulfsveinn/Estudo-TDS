package com.mycompany.exercicio_5_loja_40_porcento_desconto;
/*Uma loja está fazendo liquidação, vendendo tudo por 40% do preço original. Faça um programa em
Java que calcule o valor do desconto, dado o preço original do produto.*/
import java.util.Scanner;
public class Exercicio_5_Loja_40_Porcento_Desconto {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float preco,valor,desconto;
     System.out.print("Informe o valor da compra: ");
     valor = input.nextFloat();
      
     desconto=((valor*40)/100);
    preco=valor-desconto;   
     
     
     System.out.println("O seu desconto é de 40% e o valor da compra ficou: "+preco+"$");
     
      
      
    }
}
