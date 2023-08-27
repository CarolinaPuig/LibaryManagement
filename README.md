# LibaryManagement
Proposta de modernização de gerenciamento de uma biblioteca universitaria utilizando padrão de projeto sigleton e observer.

Para desenvolver o sistema de gerenciamento da biblioteca com os seguintes requisitos:
1. Registro de Livros: a biblioteca deve ser capaz de adicionar novos livros ao sistema, cada um com um título, isbn, autor e quantidade disponível
2. Empréstimo: Os alunos devem pegar livros emprestados. Cada livro só pode ser emprestado para um aluno de cada vez
3. Devoluçaõ de livros: após o empréstimo, os alunos devem devolver o livro

Utilizamos o padrão de projeto "Singleton" para garantir que haja apenas uma instância da classe responsável pelo gerenciamento da biblioteca. Além disso, utilizamos o padrão "Observer" para notificar os alunos quando um livro estiver disponível para empréstimo.
