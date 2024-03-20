package com.mycompany.cybercafeui;

import java.awt.Container;
import javax.swing.JFrame;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda

public class CyberCafeUI extends JFrame {

    public CyberCafeUI() {
        super("CyberCafé");
        Container c = getContentPane();
        c.add(new PainelCyberCafe());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 720);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CyberCafeUI();
    }
}