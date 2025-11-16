package activity_builder;

public class Director {
    public void buildCompleteReport(
            IRelatorioBuilder builder,
            String title,
            String body,
            String graphics,
            String footer
    ) {
        builder.addTitle(title);
        builder.addBody(body);
        builder.addGraphics(graphics);
        builder.addFooter(footer);
    }

    public void buildSimpleReport(
            IRelatorioBuilder builder,
            String title,
            String body
    ) {
        builder.addTitle(title);
        builder.addBody(body);
    }
}
