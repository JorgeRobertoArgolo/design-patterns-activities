package activity_visitor.test;

import activity_visitor.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaProcessamentoDocumentos {
    public static void main(String[] args) {

        List<IDocumento> documentos = new ArrayList<>();
        documentos.add(new DocumentoPDF());
        documentos.add(new DocumentoDOCX());
        documentos.add(new DocumentoTXT());

        IVisitante impressao = new ImpressaoVisitor();
        IVisitante visualizacao = new VisualizacaoVisitor();

        System.out.println("Operação de Impressão:");
        for (IDocumento doc : documentos) {
            doc.aceitar(impressao);
        }

        System.out.println("\nOperação de Visualização:");
        for (IDocumento doc : documentos) {
            doc.aceitar(visualizacao);
        }
    }
}
