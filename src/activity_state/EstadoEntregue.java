package activity_state;

public class EstadoEntregue implements IEstadoPedido {
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido entregue. Obrigado pela sua compra!");
    }
}
