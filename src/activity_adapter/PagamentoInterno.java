package activity_adapter;

public class PagamentoInterno implements IPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("[INTERNO] Pagamento Interno de R$: " + valor + " pelo Sistema Interno.");
    }

    @Override
    public void verificarStatus() {
        System.out.println("[INTERNO] Status verificado: Transação concluída com sucesso.");
    }
}
