
package com.mycompany.contas.java;
public class ContaEspecial extends ContaBancaria {
    
    private float limite;
   
    
    public ContaEspecial( String cliente, int num_conta, float saldo,float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
     public String dados(){
         String res=super.dados();
         res+=("\nLimite: "+getLimite());
        return res;
     }
    public boolean sacarComLimite(float valor){
        if(valor<getSaldo()+this.limite){
            System.out.println("Saque realizado com sucesso!!");
           setSaldo(getSaldo()-valor);
            return true;
        }else{
            System.out.println("Saque inválido!!");
            return false;
        }
          
      }
       
        
    }
    
    
    
    
    


