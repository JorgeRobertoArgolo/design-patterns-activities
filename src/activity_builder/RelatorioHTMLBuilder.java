package activity_builder;

public class RelatorioHTMLBuilder implements IRelatorioBuilder{
    private Relatorio report;

    public RelatorioHTMLBuilder() {
        this.report = new Relatorio();
        this.report.addPart("FORMATO: HTML");
    }

    @Override
    public void addTitle(String title) {
        report.addPart("<H1>" + title.toUpperCase()  + "</H1>");
    }

    @Override
    public void addBody(String body) {
        report.addPart("<p>" + body + "</p>");
    }

    @Override
    public void addGraphics(String dataGraphics) {
        report.addPart("<img src='grafico.svg' alt='" + dataGraphics + "' >");
    }

    @Override
    public void addFooter(String footer) {
        report.addPart("<div class='footer'>" + footer + "</div>");
    }

    @Override
    public Relatorio relatorio() {
        return this.report;
    }
}
