package activity_state;

public class EstadoProcessando implements IEstadoPedido{

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido está em processamento. Preparando para envio...");
        pedido.setEstadoAtual(new EstadoEnviado());
    }
}
