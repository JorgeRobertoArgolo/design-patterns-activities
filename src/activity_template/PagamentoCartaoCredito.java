package activity_template;

public class PagamentoCartaoCredito extends Pagamento{

    @Override
    protected void validarInformacoes() {
        System.out.println("Processando pagamento com cartão de crédito:");
        System.out.println("Validando informações do cartão de crédito.");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito.");
    }
}
