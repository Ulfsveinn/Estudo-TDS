package com.mycompany.testarlampada;

public class Lampada {
    public boolean acesa;
    public int potencia;
    
    public void acender(){
        acesa=true;
    }
    
    public void apagar(){
        acesa=false;
    }
    public void informarSituacao(){
        if(acesa==true)System.out.println("a lampada está ligada!!");
        else  System.out.println("a lampada está Desligada!!");
        
    }
    public void informarPotencia(){
        System.out.println("A potência da lâmpada é "+this.potencia);
    }
}
