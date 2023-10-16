
package com.mycompany.contas.java;
public class ContaPoupança extends ContaBancaria{
    
    private int dia_de_rendimento;

    public ContaPoupança( String cliente, int num_conta, float saldo,int dia_de_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_de_rendimento = dia_de_rendimento;
    }
    
 public int getDia_de_rendimento() {
        return dia_de_rendimento;
    }

    
    public String dados(){
         String res=super.dados();
         res+=("\nDia de Rendimento: "+getDia_de_rendimento());
        return res;
    }
    
    public void calcularNovoSaldo(float taxa){
       depositar(((getSaldo()*taxa)/100));
    }
    
    
}
