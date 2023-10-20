package com.mycompany.testarcorretora;

public class Imovel {

    private int cod;
    private float valor;
    private String endereco;
    private float areaTotal;
    private static int auxcod = 0;

    public Imovel(float valor, String endereco, float areaTotal) {
        this.cod = ++auxcod;
        this.valor = valor;
        this.endereco = endereco;
        this.areaTotal = areaTotal;

    }

    public int getCod() {
        return cod;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float calculariptu(float areaTotal) {
        return (areaTotal * 10.0f);
    }

    public String infoimovel() {
        String i = ("\nCod: " + getCod() + "\nValor: " + getValor() + "\nEndereço: " + getEndereco() + "\nArea Total: " + getAreaTotal());
        
        return i;
    }

}
