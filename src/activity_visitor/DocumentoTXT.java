package activity_visitor;

public class DocumentoTXT implements IDocumento{
    @Override
    public void aceitar(IVisitante visitante) {
        visitante.visitar(this);
    }

    @Override
    public String getConteudo() {
        return "Conteúdo do documento TXT";
    }
}
