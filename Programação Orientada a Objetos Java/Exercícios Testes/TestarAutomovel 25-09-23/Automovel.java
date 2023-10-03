package com.mycompany.testarautomovel;
public class Automovel {
    public String marca;//aqui você defini a visibilidade do atributo
    public String modelo;
    public String cor;
    public int velocidade;//não definir aqui os valores caso tenha.
    
    public void buzinar(){
        if(marca.equals("Peugeot")){//String equals é igual a um "==", mas o equals é apenas usado em objetos .
        System.out.println("BI!BI!");
        }else{
            System.out.println("Fon! Fon!");
        }
}
    public void acelerar(int valor){
    velocidade+=valor;//velocidade=velocidade+1
}
public int reduzir(int valor){
  return  (velocidade-valor);//velocidade=velocidade-1
}

}

