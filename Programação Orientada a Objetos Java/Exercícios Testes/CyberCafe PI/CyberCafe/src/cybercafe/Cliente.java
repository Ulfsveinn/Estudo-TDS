package cybercafe;
import java.sql.ResultSet;
import java.util.ArrayList;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class Cliente extends Pessoa {

    private String redeSocial;

    public Cliente(String nome, int idade, String email, String cpf, String endereco, String redeSocial) {
        super(nome, idade, email, cpf, endereco);
        this.redeSocial = redeSocial;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
    
   public int cadastrar() {
        String sql = "INSERT INTO cliente (nome, idade, email, cpf, endereco, redeSocial) VALUES ( "
            + " '" + this.getNome() + "' ,  "
            + " " + this.getIdade() + " ,  "
            + " '" + this.getEmail() + "' ,  "
            + " '" + this.getCpf() + "' ,  "
            + " '" + this.getEndereco() + "' ,  "
            + " '" + this.getRedeSocial() + "'  ) ";
        int idCliente = Conexao.executar( sql );
        return idCliente;
    }
    
    public void editar() {
        String sql = "UPDATE cliente SET "
            + " nome = '" + this.getNome() + "' ,  "
            + " idade = " + this.getIdade() + " ,  "
            + " email = '" + this.getEmail() + "' ,  "
            + " cpf = '" + this.getCpf() + "' ,  "
            + " endereco = '" + this.getEndereco() + "' ,  "
            + " redeSocial = '" + this.getRedeSocial() + "'"
            + "WHERE idCliente = " + this.getId();
        Conexao.executar(sql);
    }
    
    public static void excluir(int idCliente) {
        String sql = "DELETE FROM cliente WHERE idCliente = " + idCliente;
        Conexao.executar(sql);
    }
    
    public static ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "SELECT idCliente, nome, idade, email, cpf, endereco, redeSocial FROM cliente ORDER BY nome ";
        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    int idade = rs.getInt(1);
                    String email = rs.getString("email");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    String redeSocial = rs.getString("redeSocial");

                    Cliente cl = new Cliente(nome, idade, email, cpf, endereco, redeSocial);
                    cl.setId(rs.getInt("idCliente"));

                    lista.add(cl);
                }
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado.");
            }
        }
        return lista;
    }
    
    public void exibirDados(ArrayList<Telefone> listatelefones) {
        super.exibirDados();
        System.out.println("Rede social: " + getRedeSocial());
        System.out.println("\nTelefones:");
        for(Telefone t: listatelefones){
            t.exibirTelefones();
        }
        System.out.println("------------------------------");
    }
}