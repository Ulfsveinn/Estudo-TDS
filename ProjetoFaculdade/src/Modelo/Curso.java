package Modelo;

public class Curso {
    private String nomeCurso;
    private String responsavel;
    
    public Curso() {
    }

    public Curso(String nomeCurso, String responsavel) {
        this.nomeCurso = nomeCurso;
        this.responsavel = responsavel;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    
}
