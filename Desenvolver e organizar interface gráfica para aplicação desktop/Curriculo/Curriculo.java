package com.mycompany.curriculo;


import javax.swing.JFrame;


public class Curriculo extends JFrame{
    
public Curriculo(){
     Painel p = new Painel();
        p.setSize(850,580);
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setVisible(true);
}
    public static void main(String[] args) {
      new Curriculo();
    }
}
