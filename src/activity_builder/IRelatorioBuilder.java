package activity_builder;

public interface IRelatorioBuilder {

    void addTitle (String title);

    void addBody (String body);

    void addGraphics (String dataGraphics);

    void addFooter (String footer);

    Relatorio relatorio();
}
