package activity_iterator;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                '}';
    }
}
