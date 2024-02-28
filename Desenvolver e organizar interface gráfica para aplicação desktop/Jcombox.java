package com.mycompany.jcombox;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Jcombox extends JFrame implements ItemListener{
    
    JComboBox<String> combo; // Permite aos usuários escolher entre várias opções em um menu suspenso (como uma caixa de seleção).
    JLabel label;
     // Jeito que está funcionando:
    ImageIcon[] imagens ={
    new ImageIcon("C:\\Users\\182310002\\OneDrive\\6 - Desenvolver e organizar interface gráfica para aplicação desktop\\Jcombox\\src\\main\\java\\com\\mycompany\\jcombox\\fotos\\foto1.jpeg"),
    new ImageIcon("C:\\Users\\182310002\\OneDrive\\6 - Desenvolver e organizar interface gráfica para aplicação desktop\\Jcombox\\src\\main\\java\\com\\mycompany\\jcombox\\fotos\\foto2.jpg"),
    new ImageIcon("C:\\Users\\182310002\\OneDrive\\6 - Desenvolver e organizar interface gráfica para aplicação desktop\\Jcombox\\src\\main\\java\\com\\mycompany\\jcombox\\fotos\\foto3.jpg"),
    new ImageIcon("C:\\Users\\182310002\\OneDrive\\6 - Desenvolver e organizar interface gráfica para aplicação desktop\\Jcombox\\src\\main\\java\\com\\mycompany\\jcombox\\fotos\\foto4.jpg")
    };
    public Jcombox(){
         super("Álbum de fotos");
        Container c = getContentPane();

combo= new JComboBox<String>();// Criação de JComboBox
combo.setFont(new Font("serif",Font.PLAIN,26));// Formatação do texto das opções
combo.addItem("Foto 1"); // Criação das opções
combo.addItem("Foto 2");
combo.addItem("Foto 3");
combo.addItem("Foto 4");
combo.addItemListener(this); // Se selecionar uma das opções, chama o método itemStateChanged

label=new JLabel(imagens[0]);

c.add(BorderLayout.NORTH,combo);
c.add(BorderLayout.CENTER,label);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(500,500);
setVisible(true);
}
    public static void main(String[] args) {
        new Jcombox();
    }
@Override
public void itemStateChanged(ItemEvent e){
if(e.getStateChange()==ItemEvent.SELECTED){
    label.setIcon(imagens[combo.getSelectedIndex()]);
}
}
}





