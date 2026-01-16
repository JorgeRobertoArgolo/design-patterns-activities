package activity_memento;

import java.util.Stack;

public class Editor {
    private Stack<Memento> historico = new Stack<>();
    private Documento documento;

    public Editor(Documento documento) {
        this.documento = documento;
    }

    public void escrever (String novoTexto) {
        historico.push(documento.criarMemento());
        documento.setConteudo(novoTexto);
    }

    public void desfazer() {
        if (!historico.isEmpty()) {
            Memento mementoAnterior = historico.pop();
            documento.restaurarDeMemento(mementoAnterior);
        } else {
            System.out.println("Conteúdo do Documento: ");
            System.out.println("Nenhum estado para desfazer.");
        }
    }

    public void mostrarConteudo() {
        System.out.println("Conteúdo do Documento: " + documento.getConteudo());
    }
}
