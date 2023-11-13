package cybercafe;
import java.sql.ResultSet;
import java.util.ArrayList;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public Telefone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void cadastrar(int idCliente) {
        String sql = "INSERT INTO telefone (idCliente,ddd,numero,tipo) VALUES ( "
                + " " + idCliente + " ,  "
            + " '" + this.getDdd()+ "' ,  "
            + " '" + this.getNumero()+ "', "
            + " '" + this.getTipo()+ "'  ) ";
        Conexao.executar( sql );
    }
    
    public void editar(int idCliente) {
        String sql = "UPDATE telefone SET "
            + " tipo = '" + this.getTipo() + "' ,  "
            + " ddd = '" + this.getDdd() + "' ,  "
            + " numero = '" + this.getNumero() + "'"
            + "WHERE idCliente = " + idCliente;
        Conexao.executar(sql);
    }
    
    public static void excluir(int idCliente) {
        String sql = "DELETE FROM telefone WHERE idCliente = " + idCliente;
        Conexao.executar(sql);
    }
    
    public static ArrayList<Telefone> getTelefones(int idCliente) { 
        ArrayList<Telefone> lista = new ArrayList<>();
        String sql = "SELECT idTelefone, tipo, ddd, numero FROM telefone where idCliente = " + idCliente;
        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    String tipo = rs.getString("tipo");
                    String ddd = rs.getString("ddd");
                    String numero = rs.getString("numero");
                    
                    Telefone tel = new Telefone(tipo, ddd, numero);
                    
                    lista.add(tel);
                }
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado.");
            }
        }
        return lista;
    }
    
    
    public void exibirTelefones() {
        System.out.println("(" + getDdd() + ") " + getNumero() + " - " + getTipo());
    }
}