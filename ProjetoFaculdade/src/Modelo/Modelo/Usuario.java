package Modelo;

public class Usuario extends Pessoa{
    private String usuarioNome;
    private String senha;
    
    public Usuario() {
    }

    public Usuario(String usuarioNome, String senha) {
        this.usuarioNome = usuarioNome;
        this.senha = senha;
    }

    public Usuario(String nome, String email, TipoPessoa tipoPessoa, String usuarioNome, String senha) {
        super(nome, email, tipoPessoa);
        this.usuarioNome = usuarioNome;
        this.senha = senha;
    }
    
    
}