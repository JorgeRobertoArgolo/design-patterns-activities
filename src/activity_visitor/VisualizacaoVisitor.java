package activity_visitor;

public class VisualizacaoVisitor implements IVisitante{
    @Override
    public void visitar(DocumentoPDF pdf) {
        System.out.println("Visualizando: " + pdf.getConteudo() + ".");
    }

    @Override
    public void visitar(DocumentoDOCX docx) {
        System.out.println("Visualizando: " + docx.getConteudo() + ".");
    }

    @Override
    public void visitar(DocumentoTXT txt) {
        System.out.println("Visualizando: " + txt.getConteudo() + ".");
    }
}
