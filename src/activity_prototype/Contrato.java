package activity_prototype;

import java.util.ArrayList;
import java.util.List;

public class Contrato implements IDocumento{
    private String title;
    private String body;
    private List<Clausula> clauses;
    private String footer;

    public Contrato(String title, String body, String footer) {
        this.title = title;
        this.body = body;
        this.clauses = new ArrayList<>();
        this.footer = footer;
    }

    public void addClause(Clausula c) {
        this.clauses.add(c);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setClauses(List<Clausula> clauses) {
        this.clauses = clauses;
    }

    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

    public String getFooter() {
        return footer;
    }

    public List<Clausula> getClauses() {
        return clauses;
    }

    @Override
    public Contrato clonar() throws CloneNotSupportedException {
        Contrato clone = (Contrato) super.clone();
        clone.clauses = new ArrayList<>();

        for (Clausula clausulaOriginal: this.clauses) {
            clone.clauses.add((Clausula) clausulaOriginal.clone());
        }

        return clone;
    }

    @Override
    public void exibirDetalhes () {
        System.out.println("-------------------------------------");
        System.out.println("TÍTULO: " + title);
        System.out.println("CORPO: " + body.substring(0, Math.min(body.length(), 40)) + "...");
        System.out.println("CLÁUSULAS (" + clauses.size() + "): ");
        for (Clausula c : clauses) {
            System.out.println("  - ID " + c.getId() + ": " + c.getText());
        }
        System.out.println("RODAPÉ: " + footer);
        System.out.println("HASH: " + this.hashCode());
        System.out.println("-------------------------------------");
    }

}
