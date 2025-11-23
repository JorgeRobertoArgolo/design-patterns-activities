package activity_flyweight;

import java.util.HashMap;
import java.util.Map;

public class CartaFactory {
    private static final Map<String, Carta> cacheCartas =
            new HashMap<String, Carta>();

    public static Carta getCarta (String valor, String naipe) {
        String chave = valor + naipe;

        if (cacheCartas.containsKey(chave)) {
            System.out.println("[FACTORY] Reutilizando Carta existente: " + valor + " de " + naipe);
            return cacheCartas.get(chave);
        } else {
            //Cria nova instância e armazena no cache
            Carta novaCarta = new Carta(valor, naipe);
            cacheCartas.put(chave, novaCarta);
            return novaCarta;
        }
    }

    public static int getTotalInstanciasCriadas () {
        return cacheCartas.size();
    }
}
