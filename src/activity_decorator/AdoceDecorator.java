package activity_decorator;

public class AdoceDecorator extends BebidaDecorator{
    public AdoceDecorator(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Adoçante Natural";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.50;
    }
}
