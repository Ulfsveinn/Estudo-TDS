package com.mycompany.exercicio_2_num_impares_1_a_20;
/*Escrever os números ímpares de 1 a 20.*/

public class Exercicio_2_num_Impares_1_a_20 {
    public static void main(String[] args) {
        int num,i;
        
        
        for(i=1;i<=20;i++){
            if(i %2 != 0){
                System.out.println("Os números impares é: "+i);
            }
        }
    }
}
