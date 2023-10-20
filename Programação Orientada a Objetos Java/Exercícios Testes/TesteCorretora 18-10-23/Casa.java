package com.mycompany.testarcorretora;

public class Casa extends Imovel {

    private float areaConstruida;

    public Casa(float valor, String endereco, float areaTotal, float areaConstruida) {
        super(valor, endereco, areaTotal);
        this.areaConstruida = areaConstruida;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public float calculariptu(float areaConstruida) {
        return  ((areaConstruida*12) - (areaConstruida*12*0.35f));  
    }

    @Override
    public String infoimovel() {
        String c = super.infoimovel();
        c += ("\nArea Construida: " + getAreaConstruida());
        c+=("\nValor IPTU: "+calculariptu(getAreaTotal()));

        return c;
    }
}
