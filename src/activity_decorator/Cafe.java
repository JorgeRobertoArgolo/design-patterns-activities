package activity_decorator;

public class Cafe implements IBebida {
    @Override
    public String getDescricao() {
        return "Cafe Expresso Simples";
    }

    @Override
    public double getCusto() {
        return 3.55;
    }
}
