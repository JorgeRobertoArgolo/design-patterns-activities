package activity_flyweight;

public class Carta {
    private final String valor;
    private final String naipe;

    public Carta (String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
        System.out.println("[FACTORY] Criada nova instância de Carta: " + valor + " de " + naipe);
    }

    public String getDescricao () {
        return this.valor + " de " + this.naipe;
    }
}
