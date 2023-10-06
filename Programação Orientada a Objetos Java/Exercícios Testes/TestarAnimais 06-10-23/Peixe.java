package com.mycompany.testaranimais;
public class Peixe extends Animais {
    
    private String caracteristica;

    public Peixe( String nome, double comprimento, int numDePatas, String cor, String ambiente, double velocidadeMedia,String caracteristica) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    @Override
    public String dados(){
        String res=super.dados();
        res+=("\nCaracterística: "+getCaracteristica());
        return res;
    }
    
}
