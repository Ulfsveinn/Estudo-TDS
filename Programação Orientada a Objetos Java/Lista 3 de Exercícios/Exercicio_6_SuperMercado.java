package com.mycompany.exercicio_6_supermercado;
/*6. Um cliente de supermercado fez uma compra de 20 itens. Leia o preço de cada item e calcule o 
total que a pessoa vai pagar.*/
import java.util.Scanner;
public class Exercicio_6_SuperMercado {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador=0,i=1;
        float num,valortotal=0;
        do{
            System.out.print(i+" Digite o valor da compra: ");
            num=leia.nextFloat();
            valortotal+=num;
            i++;
            contador++;
            
                } while(contador<20);
        System.out.println("O valor total é: "+valortotal);
    
        
    }
}
