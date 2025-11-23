package activity_adapter.externa.api;

public class APIServiceStripe {
    public void debitar(double valor) {
        System.out.println("[STRIPE API] Solicitando débito de R$ " + valor + " na plataforma Stripe.");
    }

    public String obterDetalhesTransacao() {
        return "Stripe Transaction ID: STRIPE-XYZ123xyz";
    }
}
