package com.mycompany.projetouigame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
public class ProjetoUIGame extends JFrame implements ActionListener/*,ItemListener*/{
        JButton btCriar, btCancela;
        JTextField nome;
        JTextArea descricao;
        JTextArea desc;
        JRadioButton sky,ete,za,chmag,chwarr,charch;
        JCheckBox str,Agi,fur,slow,weak,clumsy;;
        String s = "";
        JLabel Classes,Reinos,nega;
       int max2;
    public ProjetoUIGame(){
    super("Criação de Personagem");
   Container c = getContentPane();
   c.setLayout(new BorderLayout());
   Container c2=new JPanel();
   c2.setLayout(new GridLayout(19,5));
   Container c3=new JPanel();
   c3.setLayout(new FlowLayout());
   Container c4=new JPanel();
   c4.setLayout(new GridLayout(2,1));
   Container cMag=new JPanel();
   cMag.setLayout(new FlowLayout());
   Container cWar=new JPanel();
   cWar.setLayout(new FlowLayout());
   Container cArch=new JPanel();
   cArch.setLayout(new FlowLayout());
  
        
   
    // Campo de texto
    c2.add(new JLabel("Nome:"));
    nome=new JTextField(20);
    c2.add(nome);
   
    c4.add(new JLabel("Descrição: "));
    desc= new JTextArea(10,20);
    c4.add(desc);
    
    Classes=(new JLabel(" Classe "));
    c2.add(Classes);
     
    //mago
    chmag = new JRadioButton("Mago");
    c2.add(chmag);
    chmag.addActionListener(this);
     c2.add(chmag);
     c2.add(new JLabel());
     //Guerreiro
    chwarr= new JRadioButton("Guerreiro");
    chwarr.addActionListener(this);
    c2.add(chwarr);
    c2.add(new JLabel());
   //arqueiro
    charch= new JRadioButton("Arqueiro");
    charch.addActionListener(this);
    c2.add(charch);
    c2.add(new JLabel());
    c2.add(new JLabel());
    //Reinos
     Reinos=(new JLabel(" Reino "));
    c2.add(Reinos);
    //Skyrim
    sky = new JRadioButton("Skyrim");
    sky.addActionListener(this);
    c2.add(sky);
    c2.add(new JLabel());
    //Éteria
     ete = new JRadioButton("Éteria");
    ete.addActionListener(this);
    c2.add(ete);
    c2.add(new JLabel());
    //Zalth
     za = new JRadioButton("Zalth");
    za.addActionListener(this);
    c2.add(za);
    c2.add(new JLabel());
    c2.add(new JLabel());
    //Caracteristicas
    //Negativos
     nega=(new JLabel(" Caract. Negativa: "));
    c2.add(nega);
    //Lento
     slow = new JCheckBox("Lento");
    c2.add(slow);
    slow.addActionListener(this);
     c2.add(slow);
     c2.add(new JLabel());
     //Fraco
    weak= new JCheckBox("Fraco");
    weak.addActionListener(this);
    c2.add(weak);
    c2.add(new JLabel());
   //Desajeitado
    clumsy= new JCheckBox("Desajeitado");
    clumsy.addActionListener(this);
    c2.add(clumsy);
    c2.add(new JLabel());
    c2.add(new JLabel());
    //Positivos
     Classes=(new JLabel(" Caract. Positiva: "));
    c2.add(Classes);
    //Força
     str = new JCheckBox("Força");
    c2.add(str);
    str.addActionListener(this);
     c2.add(str);
     c2.add(new JLabel());
     //Agilidade
    Agi= new JCheckBox("Agilidade");
    Agi.addActionListener(this);
    c2.add(Agi);
    c2.add(new JLabel());
   //Furtividade
    fur= new JCheckBox("Furtividade");
    fur.addActionListener(this);
    c2.add(fur);
    //Botões 
     btCriar= new JButton("Criar");
     c3.add(btCriar);
     btCriar.addActionListener(this);
     btCancela= new JButton("Cancelar");
     c3.add(btCancela);
     btCancela.addActionListener(this);
        
       
        c.add(BorderLayout.NORTH,c2);
        c.add(BorderLayout.SOUTH,c3);
        c.add(BorderLayout.CENTER,c4);
       
      
         weak.setEnabled(false);
         weak.setSelected(false);
         clumsy.setEnabled(false);
         clumsy.setSelected(false);
         slow.setEnabled(false);
         slow.setSelected(false);
        
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setVisible(true);
}
    public static void main(String[] args) {
        new ProjetoUIGame();
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //String s = "";
         
    if (e.getSource() == btCriar) {
        s = "Nome: " + nome.getText() + "\nDescrição: " + desc.getText();
        /*---------------------------------------------------*/
        if(chmag.isSelected()) {
         s += "\nClasse: "+ chmag.getText(); 
        }
        /*---------------------------------------------------*/
        if (chwarr.isSelected()) {
         s += "\nClasse: "+ chwarr.getText(); 
        }
        /*---------------------------------------------------*/
        else if (charch.isSelected()) {
         s += "\nClasse: "+ charch.getText(); 
        }
        /*---------------------------------------------------*/
        if (sky.isSelected()) {
         s += "\nReino: "+ sky.getText();
        }
        /*---------------------------------------------------*/
       else if (ete.isSelected()) {
         s += "\nReino: "+ ete.getText(); 
        }
       /*---------------------------------------------------*/
       else if (za.isSelected()) {
         s += "\nReino: "+ za.getText(); 
        } 
        /*---------------------------------------------------*/
        if(str.isSelected()) {
         s += "\nCaracteristicas Positivas: "+ str.getText(); 
         if(Agi.isSelected()){
             s+=", "+Agi.getText(); 
         }
         if(fur.isSelected()){
             s+=", "+fur.getText(); 
         }
        }
        /*---------------------------------------------------*/
        else if(Agi.isSelected()){
          s += "\nCaracteristicas: "+ Agi.getText(); 
          if(str.isSelected()){
             s+=", "+str.getText(); 
         }
         if(fur.isSelected()){
             s+=", "+fur.getText(); 
         }
        }
        /*---------------------------------------------------*/
        else if(fur.isSelected()){
          s += "\nCaracteristicas: "+ fur.getText(); 
           if(Agi.isSelected()){
             s+=", "+Agi.getText(); 
         }
         if(str.isSelected()){
             s+=", "+str.getText(); 
         }
        }
        /*---------------------------------------------------*/
        if(weak.isSelected()) {
         s += "\nCaracteristicas Negativa: "+ weak.getText(); 
        }
        /*---------------------------------------------------*/
        else if(slow.isSelected()){
          s += "\nCaracteristicas Negativa: "+ slow.getText(); 
        }
        /*---------------------------------------------------*/
        else if(clumsy.isSelected()){
          s += "\nCaracteristicas Negativa: "+ clumsy.getText(); 
        }
        JOptionPane.showMessageDialog(null, s);
    } 
    /*---------------------------------------------------*/
    else if (e.getSource() == btCancela) {
        nome.setText("");
        desc.setText("");
        chmag.setSelected(false);
        chwarr.setSelected(false);
        charch.setSelected(false);// Desmarca o checkbox chmag
        sky.setSelected(false);
        ete.setSelected(false);
        za.setSelected(false);
        Agi.setEnabled(true);
        Agi.setSelected(false);
        fur.setEnabled(true);
        fur.setSelected(false);
        str.setEnabled(true);
        str.setSelected(false);
        str.setSelected(false);
        fur.setSelected(false);
        weak.setEnabled(true);
        weak.setSelected(false);
        slow.setEnabled(true);
        slow.setSelected(false);
        clumsy.setEnabled(true);
        clumsy.setSelected(false);
        weak.setSelected(false);
        slow.setSelected(false);
        clumsy.setSelected(false);
           weak.setEnabled(false);
         weak.setSelected(false);
         clumsy.setEnabled(false);
         clumsy.setSelected(false);
         slow.setEnabled(false);
         slow.setSelected(false);
        } else if (e.getSource() == sky) {
                ete.setSelected(false);
                za.setSelected(false);
        } else if (e.getSource() == ete) {
                sky.setSelected(false);
                za.setSelected(false);
        } else if (e.getSource() == za) {
                sky.setSelected(false);
                ete.setSelected(false);
        }else if (e.getSource() == chmag) {
                chwarr.setSelected(false);
                charch.setSelected(false);
        } else if (e.getSource() == chwarr) {
                chmag.setSelected(false);
                charch.setSelected(false);
        } else if (e.getSource() == charch) {
                chmag.setSelected(false);
                chwarr.setSelected(false);
            }else if (e.getSource() == str) {
                max2++;
                  System.out.println(max2);
             }else if (e.getSource() == fur) {
                max2++;
                  System.out.println(max2);
             }
              else if (e.getSource() == Agi) {
                max2++;
                  System.out.println(max2);
               }
    
                if(str.isSelected() && fur.isSelected() && max2>1){
                 slow.setSelected(true);
                 Agi.setEnabled(false);
                 Agi.setSelected(false);
                 weak.setEnabled(false);
                 weak.setSelected(false);
                 clumsy.setEnabled(false);
                 clumsy.setSelected(false);
                }
                 if(str.isSelected() && Agi.isSelected() && max2>1){
                 clumsy.setSelected(true);
                 fur.setEnabled(false);
                 fur.setSelected(false);
                 slow.setEnabled(false);
                 slow.setSelected(false);
                 weak.setEnabled(false);
                 weak.setSelected(false);
                }
                  if(fur.isSelected() && Agi.isSelected() && max2>1){
                 weak.setSelected(true);
                 str.setEnabled(false);
                 str.setSelected(false);
                 slow.setEnabled(false);
                 slow.setSelected(false);
                 clumsy.setEnabled(false);
                 clumsy.setSelected(false);
                }
}
}



