package activity_visitor;

public class ImpressaoVisitor implements IVisitante {
    @Override
    public void visitar(DocumentoPDF pdf) {
        System.out.println("Imprimindo: " + pdf.getConteudo() + ".");
    }

    @Override
    public void visitar(DocumentoDOCX docx) {
        System.out.println("Imprimindo: " + docx.getConteudo() + ".");
    }

    @Override
    public void visitar(DocumentoTXT txt) {
        System.out.println("Imprimindo: " + txt.getConteudo() + ".");
    }
}
