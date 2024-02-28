

package com.mycompany.jcheckbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jcheckbox extends JFrame implements ItemListener{
     JCheckBox bold, italic;
    JLabel lbSenac, lbNegrito, lbItalico;
    

    public Jcheckbox(){
    super("Outros Controles");
    Container c = getContentPane();
    //c.setLayout(new FlowLayout());
    
    lbSenac = new JLabel("Senac TECH");
    lbSenac.setToolTipText("Técnico em Desenvolvimento de Sistemas");
    
    Font fonte = new Font("serif",Font.BOLD|Font.ITALIC,24);
    lbSenac.setFont(fonte);
    lbSenac.setForeground(Color.BLUE);
 
     Container c2 = new JPanel();
     c2.setLayout(new GridLayout(1,4));
     bold= new JCheckBox();
     bold.addItemListener(this);
     c2.add(bold);
     lbNegrito=new JLabel("negrito");
     c2.add(lbNegrito);
     italic = new JCheckBox();
     italic.addItemListener(this);
     c2.add(italic);
     c2.add(new JLabel("itálico"));
     
     c.add(BorderLayout.NORTH,lbSenac);
     c.add(BorderLayout.CENTER,c2);
   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setVisible(true);
    }
    
    public static void main(String[] args) {
        new Jcheckbox();
    }
      
    @Override
    public void itemStateChanged(ItemEvent e){
        if(bold.isSelected()&& italic.isSelected()){
            lbSenac.setFont(new Font("serif",Font.BOLD|Font.ITALIC,24));
        }
        else if(bold.isSelected()){
            lbSenac.setFont(new Font("serif",Font.BOLD,24));
        }
        else if(italic.isSelected()){
            lbSenac.setFont(new Font("serif",Font.ITALIC,24));
        }
        else{
            lbSenac.setFont(new Font("serif",Font.PLAIN,24));
        }
    }
}
