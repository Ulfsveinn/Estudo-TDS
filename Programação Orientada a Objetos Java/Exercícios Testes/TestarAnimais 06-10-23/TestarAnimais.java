
package com.mycompany.testaranimais;

public class TestarAnimais {

    public static void main(String[] args) {
        System.out.println("\nMamifero\n");
        Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",2.0,"Leite");
        System.out.println(camelo.dados());
        System.out.println("\nPeixe\n");
        Peixe Tubarao = new Peixe("Tubarão",300,0,"Cinzento","Mar",1.5,"Barbatanas e cauda");
        System.out.println(Tubarao.dados());
        System.out.println("\nMamifero\n");
        Mamifero urso = new Mamifero("Urso-do-canadá",180,4,"Vermelho","Terra",0.5,"Mel");
        System.out.println(urso.dados());
        System.out.println("\n");
    }
}
