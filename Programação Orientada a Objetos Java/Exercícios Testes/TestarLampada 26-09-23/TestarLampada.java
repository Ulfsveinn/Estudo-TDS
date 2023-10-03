package com.mycompany.testarlampada;

public class TestarLampada {

    public static void main(String[] args) {
        Lampada n1 = new Lampada();
        
        n1.acender();
        n1.informarSituacao();
        n1.apagar();
        n1.informarSituacao();
        n1.potencia=100;//se não colocar valor int, o padrão é 0.
        n1.informarPotencia();
    }
}
