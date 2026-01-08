package activity_state;

public class EstadoRecebido implements IEstadoPedido {

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido Recebido. Iniciando processamento...");
        pedido.setEstadoAtual(new EstadoProcessando());
    }
}
