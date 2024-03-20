package com.mycompany.cybercafeui;
import java.time.LocalDate;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda

public class Computador {
    
    private int id;
    private int mesa;
    private LocalDate dataReserva;
    private int tempoReserva;
    private char ocupado;
    private float valorHora;

    public Computador(int mesa, LocalDate dataReserva, int tempoReserva, char ocupado, float valorHora) {
        this.mesa = mesa;
        this.dataReserva = dataReserva;
        this.tempoReserva = tempoReserva;
        this.ocupado = ocupado;
        this.valorHora = valorHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getTempoReserva() {
        return tempoReserva;
    }

    public void setTempoReserva(int tempoReserva) {
        this.tempoReserva = tempoReserva;
    }

    public char getOcupado() {
        return ocupado;
    }

    public void setOcupado(char ocupado) {
        this.ocupado = ocupado;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
