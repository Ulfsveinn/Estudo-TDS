package cybercafe;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/cybercafe?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "root";
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SENHA = "";

    public static int executar(String query){
        int id = 0;
        try {
                Class.forName( DRIVER );
            try (Connection conn = DriverManager.getConnection(URL,USER,SENHA)) {
                PreparedStatement st = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                st.execute();
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    id=rs.getInt(1);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return id;
    }
    
    public static ResultSet consultar(String query) {
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( query );
        //    conn.close();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    } 
}