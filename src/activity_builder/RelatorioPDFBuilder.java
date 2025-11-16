package activity_builder;

public class RelatorioPDFBuilder implements IRelatorioBuilder {
    private Relatorio report;

    public RelatorioPDFBuilder() {
        this.report = new Relatorio();
        this.report.addPart("FORMATO: PDF");
    }

    @Override
    public void addTitle(String title) {
        report.addPart("[PDF] Título: " + title.toUpperCase());
    }

    @Override
    public void addBody(String body) {
        report.addPart("[PDF] Body: " + body);
    }

    @Override
    public void addGraphics(String dataGraphics) {
        report.addPart("[PDF] Graphics: " + dataGraphics);
    }

    @Override
    public void addFooter(String footer) {
        report.addPart("[PDF] Footer: " + footer);
    }

    @Override
    public Relatorio relatorio() {
        return this.report;
    }
}
