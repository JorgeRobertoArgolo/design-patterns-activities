package activity_mediator.test;

import activity_mediator.*;

public class SistemaChat {
    public static void main(String[] args) {

        Mediator salaDeChat = new ChatMediator();

        Usuario alice = new Usuario(salaDeChat, "Alice");
        Usuario bob = new Usuario(salaDeChat, "Bob");
        Usuario carol = new Usuario(salaDeChat, "Carol");

        salaDeChat.adicionarUsuario(alice);
        salaDeChat.adicionarUsuario(bob);
        salaDeChat.adicionarUsuario(carol);

        alice.enviar("Olá, pessoal!");
        System.out.println();

        bob.enviar("Oi, Alice!");
        System.out.println();

        carol.enviar("Bom dia a todos!");
    }
}
