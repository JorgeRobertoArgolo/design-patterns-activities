package activity_adapter.externa.adapter;

import activity_adapter.IPagamento;
import activity_adapter.externa.api.APIServiceStripe;

public class StripeAdapter implements IPagamento {
    private final APIServiceStripe apiServiceStripe;

    public StripeAdapter(APIServiceStripe apiServiceStripe) {
        this.apiServiceStripe = apiServiceStripe;
    }


    @Override
    public void processarPagamento(double valor) {
        apiServiceStripe.debitar(valor);
        System.out.println("[ADAPTER STRIPE] Pagamento adaptado e debitado via Stripe.");
    }

    @Override
    public void verificarStatus() {
        String detalhes =  apiServiceStripe.obterDetalhesTransacao();
        System.out.println("[ADAPTER STRIPE] Status verificado. Detalhes: " + detalhes);
    }
}
