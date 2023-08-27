package br.com.fiap;

public class SistemaGerenciamento {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstancia();

        Livro livro1 = new Livro("Livro 1", "Autor 1", "ISBN-1", 5);
        Livro livro2 = new Livro("Livro 2", "Autor 2", "ISBN-2", 3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Aluno aluno1 = new Aluno("Alice");
        Aluno aluno2 = new Aluno("Bob");

        biblioteca.addObserver(aluno1);
        biblioteca.addObserver(aluno2);

        aluno1.pegarLivroEmprestado(livro1);
        aluno2.pegarLivroEmprestado(livro1);
        aluno2.pegarLivroEmprestado(livro2);

        aluno1.devolverLivro(livro1);
        aluno2.devolverLivro(livro1);
        aluno2.devolverLivro(livro2);
    }
}