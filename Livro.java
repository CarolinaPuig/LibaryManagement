package br.com.fiap;

public class Livro {
 private String titulo;
    private String autor;
    private String isbn;
    private int quantidade;

    public Livro(String titulo, String autor, String isbn, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void diminuirQuantidade() {
        quantidade--;
    }

    public void aumentarQuantidade() {
        quantidade++;
    }

}
