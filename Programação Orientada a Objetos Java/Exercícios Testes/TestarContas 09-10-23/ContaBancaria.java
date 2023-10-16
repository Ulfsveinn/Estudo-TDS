
package com.mycompany.contas.java;
public class ContaBancaria {
    
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta++;
        this.saldo = saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    public String getCliente() {
        return cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public boolean sacar(float sacar){
        if(sacar<=saldo){
            System.out.println("Saque realizado com sucesso!!");
           saldo-=sacar;
            return true;
        }else{
            System.out.println("Saque inválido!!");
            return false;
        }
    }
    
    public boolean depositar(float depositar){
        if(depositar>=1){
            System.out.println("Depósito realizado com sucesso!!");
            saldo+=depositar;
            return true;
        }else{
            System.out.println("Depósito inválido!!");
            return false;
        }
    }
    
    public String dados(){
            String res=("Nome: "+getCliente()+"\nNúmero da conta: "+getNum_conta()+"\nSaldo: "+getSaldo());
            return res;
    }
    
    
}
