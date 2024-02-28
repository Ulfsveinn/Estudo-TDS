package com.mycompany.outroscontroles;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutrosControles extends JFrame{
  
public OutrosControles(){
    super("Outros Controles");
    Container c = getContentPane();
    //c.setLayout(new FlowLayout());
    
   JLabel lbSenac = new JLabel("Senac TECH");
    lbSenac.setToolTipText("Técnico em Desenvolvimento de Sistemas");
    
    Font fonte = new Font("serif",Font.BOLD|Font.ITALIC,24);
    lbSenac.setFont(fonte);
    lbSenac.setForeground(Color.BLUE);
    
    String caminho="C:\\Users\\182310002\\OneDrive\\6 - Desenvolver e organizar interface gráfica para aplicação desktop\\outrosControles\\src\\main\\java\\com\\mycompany\\outroscontroles\\fotos\\Planeta.png";
    ImageIcon minhaImagem = new ImageIcon(caminho);
    JLabel lbImage = new JLabel(minhaImagem);
   
     
    //c.add(lbSenac);
    c.add(BorderLayout.NORTH,lbSenac);
    c.add(BorderLayout.CENTER,lbImage);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setVisible(true);
    }

    public static void main(String[] args) {
        new OutrosControles(); 
            }
  
 }


