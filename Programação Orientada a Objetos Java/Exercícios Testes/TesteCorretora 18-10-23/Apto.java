package com.mycompany.testarcorretora;

public class Apto extends Imovel {

    private float areaPrivativa;

    public Apto(float valor, String endereco, float areaTotal, float areaPrivativa) {
        super(valor, endereco, areaTotal);
        this.areaPrivativa = areaPrivativa;
    }

    @Override
    public float calculariptu(float areaPrivativa) {

        float valor =((areaPrivativa*10.0f) + (getAreaTotal()/24 + areaPrivativa*5));
        return (valor-(valor*0.25f));
    }

    public float getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(float areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }

    @Override
    public String infoimovel() {
        String a = super.infoimovel();
        a += ("\nArea Construida: " + getAreaPrivativa());
        System.out.println("Valor IPTU: "+calculariptu(getAreaTotal()));
        return a;
    }
}
