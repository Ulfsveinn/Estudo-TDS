package Modelo;

public class Arquivo {
    private String localModelo;
    private String nomeArquivo;
    private String descricaoArquivo;

    public Arquivo() {
    }
    
    public Arquivo(String localModelo, String nomeArquivo, String descricaoArquivo) {
        this.localModelo = localModelo;
        this.nomeArquivo = nomeArquivo;
        this.descricaoArquivo = descricaoArquivo;
    }

    public String getLocalModelo() {
        return localModelo;
    }

    public void setLocalModelo(String localModelo) {
        this.localModelo = localModelo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getDescricaoArquivo() {
        return descricaoArquivo;
    }

    public void setDescricaoArquivo(String descricaoArquivo) {
        this.descricaoArquivo = descricaoArquivo;
    }

    
}
