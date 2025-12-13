package activity_iterator;

import java.util.List;

public class BibliotecaIterator implements Iterator{

    private List<Livro> livros;
    private int indice = 0;

    public BibliotecaIterator(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean temProximo() {
        //verifica se a posição está dentro dos limites da lista
        return indice < livros.size();
    }

    @Override
    public Object proximo() {
        if (temProximo()) {
            // Retorna o elemento atual e avança a posição
            Livro livro = livros.get(indice);
            indice++;
            return livro;
        }
        return null;
    }
}
