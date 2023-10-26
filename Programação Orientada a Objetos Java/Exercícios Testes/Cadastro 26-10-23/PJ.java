package com.mycompany.cadastro;
public class PJ extends Pessoa implements Aniversario{
    private String cnpj;

    public PJ(String cnpj, String nome, int idade) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public PJ(String nome, int idade) {
        super(nome, idade);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void fazerAniversario(){
        setIdade(getIdade()+1);
    }
    
@Override
    public void fazerAniversario(int aniver){
        setIdade(getIdade()+aniver);
    }
    
    @Override
    public String dados() {
        String c = super.dados();
        if(getCnpj()!=null) c+=("\nCNPJ: "+getCnpj());
        else{
           c+=("\nCNPJ não cadastrado!");
        }
        return c;
    }
    
    
}