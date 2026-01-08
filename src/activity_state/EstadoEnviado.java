package activity_state;

public class EstadoEnviado implements IEstadoPedido{
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido enviado. Aguardando entrega...");
        pedido.setEstadoAtual(new EstadoEntregue());
    }
}
