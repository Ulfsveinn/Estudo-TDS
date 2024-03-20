package com.mycompany.cybercafeui;
import java.time.LocalDate;

// Projeto Integrador - CyberCafé Java Swing + Banco de dados

// Nomes: André Luis Mesquita Barbosa Júnior, Laís Pereira Barbizan,
// Luís Henrique Medeiros Vanz e Milena Fontana Bregalda

public class Pedido {
    
    private int id;
    private LocalDate dataPedido;

    public Pedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

}
