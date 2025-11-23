package activity_flyweight;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private final String nome;
    private final List<Carta> mao = new ArrayList();

    public Jogador (String nome) {
        this.nome = nome;
    }

    public void receberCarta (String valor, String naipe) {
        Carta carta = CartaFactory.getCarta(valor, naipe);
        mao.add(carta);
        System.out.println("   [" + nome + "] Recebeu: " + carta.getDescricao());
    }

    public void jogarCarta (int indice) {
        if (indice < mao.size()) {
            Carta carta = mao.get(indice);
            System.out.println("   [" + nome + "] Joga: " + carta.getDescricao());
        }
    }
}
