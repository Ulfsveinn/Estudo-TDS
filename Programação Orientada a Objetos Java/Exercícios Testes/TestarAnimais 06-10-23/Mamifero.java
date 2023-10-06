package com.mycompany.testaranimais;
public class Mamifero extends Animais {
    
    private String alimento;

    public Mamifero(String nome, double comprimento, int numDePatas, String cor, String ambiente, double velocidadeMedia,String alimento) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    @Override
    public String dados(){
        String res=super.dados();
       res+=("\nAlimento: "+getAlimento());
       return res;
    }
}
