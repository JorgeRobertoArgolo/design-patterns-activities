package activity_decorator;

public class Cha implements IBebida {
    @Override
    public String getDescricao() {
        return "Chá de Camomila";
    }

    @Override
    public double getCusto() {
        return 2.20;
    }
}
