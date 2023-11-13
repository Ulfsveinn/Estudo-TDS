package cybercafe;
import java.sql.ResultSet;
import java.util.ArrayList;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class Funcionario extends Pessoa {
    private String funcao;
    
    public Funcionario(String funcao, String nome, int idade, String email, String cpf, String endereco) {
        super(nome, idade, email, cpf, endereco);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public int cadastrar() {
        String sql = "INSERT INTO funcionario (nome, idade, email, cpf, endereco, funcao) VALUES ( "
            + " '" + this.getNome() + "' ,  "
            + " " + this.getIdade() + " ,  "
            + " '" + this.getEmail() + "' ,  "
            + " '" + this.getCpf() + "' ,  "
            + " '" + this.getEndereco() + "' ,  "
            + " '" + this.getFuncao() + "'  ) ";
       int idFuncionario = Conexao.executar( sql );
       return idFuncionario;
    }
    
    public void editar() {
        String sql = "UPDATE funcionario SET "
            + " nome = '" + this.getNome() + "' ,  "
            + " idade = " + this.getIdade() + " ,  "
            + " email = '" + this.getEmail() + "' ,  "
            + " cpf = '" + this.getCpf() + "' ,  "
            + " endereco = '" + this.getEndereco() + "' ,  "
            + " funcao = '" + this.getFuncao() + "'  "
            + "WHERE idFuncionario = " + this.getId();
        Conexao.executar(sql);
    }
    
    public static void excluir(int idFuncionario) {
        String sql = "DELETE FROM funcionario WHERE idFuncionario = " + idFuncionario;
        Conexao.executar(sql);
    }
    
    public static ArrayList<Funcionario> getFuncionarios() {
        ArrayList<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT idFuncionario, nome, idade, email, cpf, endereco, funcao FROM funcionario ORDER BY nome ";
        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    int idade = rs.getInt(1);
                    String email = rs.getString("email");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    String funcao = rs.getString("funcao");

                    Funcionario func = new Funcionario(funcao, nome, idade, email, cpf, endereco);
                    func.setId(rs.getInt("idFuncionario"));

                    lista.add(func);
                }
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado.");
            }
        }
        return lista;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Função: " + getFuncao());
        System.out.println("------------------------------");
    }
}