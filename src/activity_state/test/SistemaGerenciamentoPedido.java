package activity_state.test;

import activity_state.Pedido;

public class SistemaGerenciamentoPedido {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Gerenciamento de Pedidos ---");

        Pedido meuPedido = new Pedido();

        meuPedido.avancarPedido();
        meuPedido.avancarPedido();
        meuPedido.avancarPedido();
        meuPedido.avancarPedido();
    }
}
