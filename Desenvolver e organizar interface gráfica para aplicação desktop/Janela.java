package com.mycompany.janela;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
    
    public Janela()
    {
        super("Layouts");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
       Container c2 = new JPanel();
       c2.setLayout(new GridLayout(4,9));
        //c.setLayout(new GridLayout(2,3)); GridLayout
        //c.setLayout(new FlowLayout()); FlowLayout
        c2.add(new JButton("Ok"));
        c2.add(new JButton("Cancel"));
        c2.add(new JButton("Setup"));
        c2.add(new JButton("Help"));
 
        c.add(BorderLayout.CENTER, new JButton("Centro"));
        c.add(BorderLayout.EAST,c2);



        
        /*JButoon*/
//       JButton botao = new JButton("Botão 1");//cria o objeto tipo JButton
//       JButton botao2 = new JButton("Botão 2");
//       getContentPane().add(botao);//Este método é usado para obter o contêiner principal de um JFrame.
//       getContentPane().add(botao2);
        
        
        /*BorderLayout*/
//        super("Layouts");
//        Container c = getContentPane();
//        c.add(BorderLayout.NORTH, new JButton("Botão 1"));
//        c.add(BorderLayout.WEST, new JButton("Botão 2"));
//        c.add(BorderLayout.CENTER, new JButton("Botão 3"));
//        c.add(BorderLayout.EAST, new JButton("Botão 4"));
//        c.add(BorderLayout.SOUTH, new JButton("Botão 5"));
        
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//faz com que execute o fechamento da pagina ao clicar no "x"
       setSize(300,300);//Define o tamanho e largura da pagina
       setVisible(true);//faz a janela aparecer para o usuario.
       
       
       /*JFrame*/
//      JFrame minhaJanela = new JFrame();// Cria objeto do tipo JFrame
//      minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//faz com que execute o fechamento da pagina ao clicar no "x"
//      minhaJanela.setSize(300, 300);//Define o tamanho e largura da pagina 
//      minhaJanela.setVisible(true);//faz a janela aparecer para o usuario.
    }
    public static void main(String[] args) {
        new Janela();
    }
}
