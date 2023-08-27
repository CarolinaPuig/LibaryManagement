package br.com.fiap;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Biblioteca extends Observable {
    private List<Livro> livros;

    private Biblioteca() {
        livros = new ArrayList<>();
    }

    private static class BibliotecaHolder {
        private static final Biblioteca INSTANCIA = new Biblioteca();
    }

    public static Biblioteca getInstancia() {
        return BibliotecaHolder.INSTANCIA;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        setChanged();
        notifyObservers(livro);
    }

    public Livro encontrarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(Livro livro) {
        livro.diminuirQuantidade();
    }

    public void devolverLivro(Livro livro) {
        livro.aumentarQuantidade();
    }
}