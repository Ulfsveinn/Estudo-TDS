package com.mycompany.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eventos extends JFrame implements ActionListener {

    public Eventos(){
        super("Eventos");
        JButton botao = new JButton("Ok");
        botao.addActionListener(this);
        getContentPane().add(botao);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Eventos();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Olá, isso é uma caixa de Mensagem","CAIXA DE MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
    }
}
