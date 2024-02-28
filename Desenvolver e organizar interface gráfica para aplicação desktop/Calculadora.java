package com.mycompany.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Calculadora extends JFrame implements ActionListener{
    
    JButton Bt0,Bt1,Bt2,Bt3,Bt4,Bt5,Bt6,Bt7,Bt8,Bt9,Btsoma,Btdiv,Btsub,Btmulti,Btres,Btlimpa;
    JTextField resultado;
    String v1="",v2="",op="";
    
    public Calculadora(){
        super("Calculadora");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(5,9));
        
       
                
        c2.add(Btsoma=new JButton ("+"));
        c2.add(Btsub=new JButton ("-"));
        c2.add(Btdiv=new JButton ("/"));
        c2.add(Btmulti=new JButton ("*"));
        c2.add(Bt1=new JButton ("1"));
        c2.add(Bt2=new JButton ("2"));
        c2.add(Bt3=new JButton ("3"));
        c2.add(Bt4=new JButton ("4"));
        c2.add(Bt5=new JButton ("5"));
        c2.add(Bt6=new JButton ("6"));
        c2.add(Bt7=new JButton ("7"));
        c2.add(Bt8=new JButton ("8"));
        c2.add(Bt9=new JButton ("9"));
        c2.add(Bt0=new JButton ("0"));
        c2.add(Btres= new JButton ("="));
        c2.add(Btlimpa= new JButton("C"));
        
        c.add(BorderLayout.NORTH, resultado = new JTextField());
        c.add(BorderLayout.SOUTH,c2);
       
        
       //Numeros 
       Bt0.addActionListener(this);
       Bt1.addActionListener(this);
       Bt2.addActionListener(this);
       Bt3.addActionListener(this);
       Bt4.addActionListener(this);
       Bt5.addActionListener(this);
       Bt6.addActionListener(this);
       Bt7.addActionListener(this);
       Bt8.addActionListener(this);
       Bt9.addActionListener(this);
       //Operações
       Btsoma.addActionListener(this);
       Btdiv.addActionListener(this);
       Btsub.addActionListener(this);
       Btmulti.addActionListener(this);
       Btres.addActionListener(this);
       Btlimpa.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculadora();
    }
    
        @Override
        public void actionPerformed(ActionEvent e)
        {
          String s = e.getActionCommand();
          if((s.charAt(0)>='0') && s.charAt(0)<='9'){
              if(!op.equals(""))
                  v2 = v2 +s;
              else{
                  v1=v1+s;
              }
              resultado.setText(v1+op+v2);
          }else if(s.charAt(0)=='C'){
              v1=op=v2="";
              resultado.setText(v1+op+v2);
          }else if(s.charAt(0)=='='){
                  int te=0;
                  if(op.equals("+"))te=(Integer.parseInt(v1)+Integer.parseInt(v2));
                  if(op.equals("-"))te=(Integer.parseInt(v1)-Integer.parseInt(v2));
                  if(op.equals("/"))te=(Integer.parseInt(v1)/Integer.parseInt(v2));
                  if(op.equals("*"))te=(Integer.parseInt(v1)*Integer.parseInt(v2));
                     
                      resultado.setText(v1+op+v2+"="+te);
                      v1=Integer.toString(te);
                      op=v2="";
          }else{
              op=s;
          }
        }            
}