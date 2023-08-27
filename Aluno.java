package br.com.fiap;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Aluno implements Observer {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Aluno(String nome) {
        this.nome = nome;
        livrosEmprestados = new ArrayList<>();
    }

	public void pegarLivroEmprestado(Livro livro) {
        if (livro.getQuantidade() > 0) {
            livrosEmprestados.add(livro);
            Biblioteca.getInstancia().emprestarLivro(livro);
            System.out.println(nome + " pegou emprestado o livro: " + livro.getTitulo());
        } else {
            System.out.println("Não há cópias disponíveis do livro: " + livro.getTitulo());
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
            Biblioteca.getInstancia().devolverLivro(livro);
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println(nome + " não tinha pego emprestado o livro: " + livro.getTitulo());
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Livro) {
            Livro livro = (Livro) arg;
            System.out.println("Ei, " + nome + "! O livro " + livro.getTitulo() + " está disponível para empréstimo.");
        }
    }
}





