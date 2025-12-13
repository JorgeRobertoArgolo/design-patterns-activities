package activity_iterator;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements IColecao{

    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("[Biblioteca] Adicionado: " + livro.toString());
    }

    @Override
    public Iterator criarIterador() {
        return new BibliotecaIterator(this.livros);
    }
}
