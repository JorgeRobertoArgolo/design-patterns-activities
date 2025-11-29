package activity_decorator;

public class ChocolateQuente implements IBebida{
    @Override
    public String getDescricao() {
        return "Chocolate Quente";
    }

    @Override
    public double getCusto() {
        return 5.50;
    }
}
