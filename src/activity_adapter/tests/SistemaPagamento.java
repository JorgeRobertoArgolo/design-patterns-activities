package activity_adapter.tests;

import activity_adapter.IPagamento;
import activity_adapter.PagamentoInterno;
import activity_adapter.externa.adapter.PayPalAdapter;
import activity_adapter.externa.adapter.StripeAdapter;
import activity_adapter.externa.api.APIServicePayPal;
import activity_adapter.externa.api.APIServiceStripe;

public class SistemaPagamento {
    public static void main(String[] args) {
        System.out.println("--- Sistema E-commerce: Integração de Pagamentos com Adapter ---");

        // 1. Pagamento Interno (Sem Adaptador)
        System.out.println("\n[Caso A: Pagamento Interno Existente]");
        IPagamento pagamentoInterno = new PagamentoInterno();
        pagamentoInterno.processarPagamento(100.00);
        pagamentoInterno.verificarStatus();

        // 2. Pagamento via PayPal (Usando Adapter)
        System.out.println("\n[Caso B: Pagamento PayPal (via Adapter)]");
        APIServicePayPal payPalAPI = new APIServicePayPal();
        // O Adaptador é tratado como um objeto Pagamento normal
        IPagamento pagamentoPayPal = new PayPalAdapter(payPalAPI);
        pagamentoPayPal.processarPagamento(250.50);
        pagamentoPayPal.verificarStatus();

        // 3. Pagamento via Stripe (Usando Adapter)
        System.out.println("\n[Caso C: Pagamento Stripe (via Adapter)]");
        APIServiceStripe stripeAPI = new APIServiceStripe();
        // O Adaptador é tratado como um objeto Pagamento normal
        IPagamento pagamentoStripe = new StripeAdapter(stripeAPI);
        pagamentoStripe.processarPagamento(75.99);
        pagamentoStripe.verificarStatus();
    }
}
