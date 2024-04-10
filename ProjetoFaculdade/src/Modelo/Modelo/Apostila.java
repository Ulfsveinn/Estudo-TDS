package Modelo;

public class Apostila {
    private String nomeApostila;
    private String cursoApostila;
    private int numeroPag;

    public Apostila() {
    }

    public Apostila(String nomeApostila, String cursoApostila, int numeroPag) {
        this.nomeApostila = nomeApostila;
        this.cursoApostila = cursoApostila;
        this.numeroPag = numeroPag;
    }
    
    public String getNomeApostila() {
        return nomeApostila;
    }
    public void setNomeApostila(String nomeApostila) {
        this.nomeApostila = nomeApostila;
    }
    public String getCursoApostila() {
        return cursoApostila;
    }
    public void setCursoApostila(String cursoApostila) {
        this.cursoApostila = cursoApostila;
    }
    public int getNumeroPag() {
        return numeroPag;
    }
    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    
}
