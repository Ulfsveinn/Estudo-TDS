package Modelo;

import java.sql.Date;

public class MaterialDidatico {
    private Date dataEntrega;
    private Date dataRevisao;
    private boolean estaCompleto;
    private Curso[] cursos;
    private Slide[] slides;
    private Apostila[] apostilas;
    
    public MaterialDidatico(Date dataEntrega, Date dataRevisao, boolean estaCompleto, Curso[] cursos, Slide[] slides,
            Apostila[] apostilas) {
        this.dataEntrega = dataEntrega;
        this.dataRevisao = dataRevisao;
        this.estaCompleto = estaCompleto;
        this.cursos = cursos;
        this.slides = slides;
        this.apostilas = apostilas;
    }

    public MaterialDidatico() {
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(Date dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public boolean isEstaCompleto() {
        return estaCompleto;
    }

    public void setEstaCompleto(boolean estaCompleto) {
        this.estaCompleto = estaCompleto;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Slide[] getSlides() {
        return slides;
    }

    public void setSlides(Slide[] slides) {
        this.slides = slides;
    }

    public Apostila[] getApostilas() {
        return apostilas;
    }

    public void setApostilas(Apostila[] apostilas) {
        this.apostilas = apostilas;
    }

    
}
