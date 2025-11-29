package activity_decorator;

public class SaborDecorator extends BebidaDecorator{
    private String sabor;

    public SaborDecorator(IBebida bebida, String sabor) {
        super(bebida);
        this.sabor = sabor;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com sabor de " + sabor;
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.25;
    }
}
