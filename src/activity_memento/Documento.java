package activity_memento;

public class Documento {
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Memento criarMemento () {
        return new Memento(conteudo);
    }

    public void restaurarDeMemento (Memento memento) {
        this.conteudo = memento.getEstadoSalvo();
    }
}
