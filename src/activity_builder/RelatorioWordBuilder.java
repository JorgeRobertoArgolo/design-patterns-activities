package activity_builder;

public class RelatorioWordBuilder implements IRelatorioBuilder{
    private Relatorio report;

    public RelatorioWordBuilder() {
        this.report = new Relatorio();
        this.report.addPart("Formato: WORD (.docx)");
    }

    @Override
    public void addTitle(String title) {
        report.addPart(">> Seção: Título Word: " + title.toUpperCase());
    }

    @Override
    public void addBody(String body) {
        report.addPart(">> Seção: Tabela de Dados: " + body);
    }

    @Override
    public void addGraphics(String dataGraphics) {
        //No need graphics
    }

    @Override
    public void addFooter(String footer) {
        report.addPart(">> Seção: Número da Página: " + footer);
    }

    @Override
    public Relatorio relatorio() {
        return this.report;
    }
}
