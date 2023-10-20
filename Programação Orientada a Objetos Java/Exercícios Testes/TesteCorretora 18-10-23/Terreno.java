package com.mycompany.testarcorretora;

public class Terreno extends Imovel {

    private String tipo;

    public Terreno(float valor, String endereco, float areaTotal, String tipo) {
        super(valor, endereco, areaTotal);
        this.tipo = tipo;
    }

    @Override
    public String infoimovel() {
        String t = super.infoimovel();
        t += ("\nArea Construida: " + getTipo());
        System.out.println("Valor IPTU: "+calculariptu(getAreaTotal()));
        return t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
