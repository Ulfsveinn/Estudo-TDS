package Modelo;

public class Slide {
    private String nomeSlide;
    private String cursoSlide;
    private int numeroPag;

    public Slide() {
    }
    
    public Slide(String nomeSlide, String cursoSlide, int numeroPag) {
        this.nomeSlide = nomeSlide;
        this.cursoSlide = cursoSlide;
        this.numeroPag = numeroPag;
    }

    public String getNomeSlide() {
        return nomeSlide;
    }

    public void setNomeSlide(String nomeSlide) {
        this.nomeSlide = nomeSlide;
    }

    public String getCursoSlide() {
        return cursoSlide;
    }

    public void setCursoSlide(String cursoSlide) {
        this.cursoSlide = cursoSlide;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    
}
