package activity_template;

public class PagamentoPaypal extends Pagamento {
    @Override
    protected void validarInformacoes() {
        System.out.println("Processando pagamento via PayPal:");
        System.out.println("Validando informações do PayPal.");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento via PayPal.");
    }
}
