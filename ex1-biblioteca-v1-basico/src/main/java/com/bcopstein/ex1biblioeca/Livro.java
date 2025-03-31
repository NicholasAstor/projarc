package com.bcopstein.ex1biblioeca;

public class Livro {
    private String titulo;
    private String autor;
    private int id;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int id, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
