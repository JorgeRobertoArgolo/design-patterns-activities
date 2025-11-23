package activity_adapter.externa.adapter;

import activity_adapter.IPagamento;
import activity_adapter.externa.api.APIServicePayPal;

public class PayPalAdapter implements IPagamento {

    private final APIServicePayPal apiServicePayPal;
    private final String TOKEN_PAYPAL = "ABC-123-PAYPAL";

    public PayPalAdapter(APIServicePayPal apiServicePayPal) {
        this.apiServicePayPal = apiServicePayPal;
    }

    @Override
    public void processarPagamento(double valor) {
        apiServicePayPal.efetuarTransacao(valor, TOKEN_PAYPAL);
        System.out.println("[ADAPTER PAYPAL] Transação adaptada e enviada com sucesso.");
    }

    @Override
    public void verificarStatus() {
        if (apiServicePayPal.verificarConexao()) {
            System.out.println("[ADAPTER PAYPAL] Status verificado: Conexão PayPal OK.");
        }
    }
}
