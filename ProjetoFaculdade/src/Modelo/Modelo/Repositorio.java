package Modelo;

public class Repositorio {
    private TipoPessoa responsavel;
    private String localizacao;
    
    public Repositorio(TipoPessoa responsavel, String localizacao) {
        this.responsavel = responsavel;
        this.localizacao = localizacao;
    }

    public TipoPessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(TipoPessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    
}
