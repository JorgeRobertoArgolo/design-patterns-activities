package activity_iterator.test;

import activity_iterator.Biblioteca;
import activity_iterator.Iterator;
import activity_iterator.Livro;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Biblioteca (Padrão Iterator) ---");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("Cem Anos de Solidão", "Gabriel García Márquez"));

        System.out.println("\n--- NAVEGANDO NA COLEÇÃO USANDO O ITERATOR ---");

        Iterator iterador = biblioteca.criarIterador();

        while (iterador.temProximo()) {
            Livro livro = (Livro) iterador.proximo();
            System.out.println(livro.toString());
        }
    }
}
