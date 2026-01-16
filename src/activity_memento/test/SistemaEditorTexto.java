package activity_memento.test;

import activity_memento.*;

public class SistemaEditorTexto {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Editor editor = new Editor(doc);

        doc.setConteudo("Versão 1 do documento.");
        editor.mostrarConteudo();

        editor.escrever("Versão 2 do documento.");
        editor.mostrarConteudo();

        editor.escrever("Versão 3 do documento.");
        editor.mostrarConteudo();

        System.out.println("\n--- Desfazer ---");

        editor.desfazer();
        editor.mostrarConteudo();

        editor.desfazer();
        editor.mostrarConteudo();

        editor.desfazer();
    }
}
