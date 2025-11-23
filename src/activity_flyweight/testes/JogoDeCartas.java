package activity_flyweight.testes;

import activity_flyweight.CartaFactory;
import activity_flyweight.Jogador;

public class JogoDeCartas {
    public static void main(String[] args) {
        System.out.println("--- JOGO DE CARTAS ONLINE ---");

        // Instancia os jogadores
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");

        System.out.println("\n--- RODADA 1: Alice e Bob recebem o 'Ás de Copas' ---");

        // JOGADOR 1 recebe Ás de Copas (PRIMEIRA CRIAÇÃO)
        jogador1.receberCarta("Ás", "Copas");

        // JOGADOR 2 recebe Ás de Copas (REUTILIZAÇÃO)
        jogador2.receberCarta("Ás", "Copas");

        System.out.println("\n--- RODADA 2: Cartas Únicas ---");

        // Alice recebe Rainha de Paus (NOVA CRIAÇÃO)
        jogador1.receberCarta("Rainha", "Paus");

        // Bob recebe 7 de Espadas (NOVA CRIAÇÃO)
        jogador2.receberCarta("7", "Espadas");

        System.out.println("\n--- RODADA 3: Alice recebe 7 de Espadas (REUTILIZAÇÃO) ---");

        // Alice recebe 7 de Espadas (REUTILIZAÇÃO da carta do Bob)
        jogador1.receberCarta("7", "Espadas");

        System.out.println("\n--- FASE DE JOGO ---");
        jogador1.jogarCarta(0); // Alice joga Ás de Copas
        jogador2.jogarCarta(0); // Bob joga Ás de Copas

        System.out.println("\n--- RESULTADO FINAL (Economia de Memória) ---");
        System.out.println("Instâncias de Cartas UNICAS criadas: " + CartaFactory.getTotalInstanciasCriadas());
    }
}
