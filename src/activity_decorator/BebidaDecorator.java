package activity_decorator;

public abstract class BebidaDecorator implements IBebida{
    protected IBebida bebida;

    public BebidaDecorator(IBebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getCusto();
}
