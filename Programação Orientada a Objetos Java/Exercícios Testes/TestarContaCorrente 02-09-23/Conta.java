package com.mycompany.testarcontacorrente;

public class Conta {
    public float saldo;
    
    public void DefinirSaldoAtual(float definir){
        saldo=definir;
        System.out.println("O seu saldo inicial é de R$ "+definir);
    }
    public void depositar(float depositando){
        if(depositando<=0){
            System.out.println("Saldo para deposito inválido!");
        }else{
        saldo+=depositando;
        System.out.println("Foi depositado em sua conta R$ "+depositando);
        }
    }
    
    public boolean sacar(float sacando){
        
        if(sacando<=saldo){
            saldo-=sacando;
            return true;
        }else{
            return false;
        }
        
         
        
    }

    
}
