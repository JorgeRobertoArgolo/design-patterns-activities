package activity_state;

public class Pedido {
    private IEstadoPedido estadoAtual;

    public Pedido() {
        this.estadoAtual = new EstadoRecebido();
    }

    public IEstadoPedido getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(IEstadoPedido estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void avancarPedido () {
        estadoAtual.processar(this);
    }
}
