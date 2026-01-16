package activity_visitor;

public class DocumentoDOCX implements IDocumento {
    @Override
    public void aceitar(IVisitante visitante) {
        visitante.visitar(this);
    }

    @Override
    public String getConteudo() {
        return "Conteúdo do documento DOCX";
    }
}
