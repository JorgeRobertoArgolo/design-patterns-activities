package activity_visitor;

public interface IDocumento {
    void aceitar(IVisitante visitante);
    String getConteudo();
}
