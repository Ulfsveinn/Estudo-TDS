package com.mycompany.projetosenhas;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class ProjetoSenhas extends JFrame implements ActionListener{

    
        JButton btOk, btCancela;
        JTextField login;
        JPasswordField senha;
    
    public ProjetoSenhas(){
        super("Formulario de senhas");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,9));
        
        c.add(new JLabel("Login"));
        login = new JTextField();
        c.add(login);
        
        c.add(new JLabel("Senha"));
        senha = new JPasswordField();
        c.add(senha);
       
        btCancela= new JButton("Cancela");
        c.add(btCancela);
        btCancela.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ProjetoSenhas();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String s="";
        if(e.getSource()==btOk){
            s="Login: "+login.getText()
                    +"\n Senha: "+new String(senha.getPassword());
            JOptionPane.showMessageDialog(null, s);
    }else if(e.getSource()==btCancela){
        login.setText("");
        senha.setText("");
    }
}
}
