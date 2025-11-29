package activity_decorator;

public class LeiteDecorator extends BebidaDecorator {

    public LeiteDecorator(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + " com leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.75;
    }
}
