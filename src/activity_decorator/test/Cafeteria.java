package activity_decorator.test;

import activity_decorator.*;

import java.text.DecimalFormat;

public class Cafeteria {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("--- Sistema de Pedidos da Cafeteria ---");

        // ========================================================
        // PEDIDO 1: CAFÉ
        // ========================================================
        IBebida pedido1 = new Cafe();
        System.out.println("\n[PEDIDO 1] " + pedido1.getDescricao() + "\nCusto: R$ " + df.format(pedido1.getCusto()));

        // ========================================================
        // PEDIDO 2: CHÁ PERSONALIZADO
        // ========================================================

        IBebida pedido2 = new Cha();
        pedido2 = new LeiteDecorator(pedido2);
        pedido2 = new AdoceDecorator(pedido2);

        System.out.println("\n[PEDIDO 2] " + pedido2.getDescricao() + "\nCusto: R$ " + df.format(pedido2.getCusto()));

        // ========================================================
        // PEDIDO 3: CHOCOLATE QUENTE PERSONALIZADO
        // ========================================================

        IBebida pedido3 = new ChocolateQuente();

        pedido3 = new SaborDecorator(pedido3, "Caramelo");
        pedido3 = new LeiteDecorator(pedido3);
        pedido3 = new SaborDecorator(pedido3, "Baunilha");

        System.out.println("\n[PEDIDO 3] " + pedido3.getDescricao() + "\nCusto: R$ " + df.format(pedido3.getCusto()));
    }
}
