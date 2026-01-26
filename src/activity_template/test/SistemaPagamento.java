package activity_template.test;

import activity_template.Pagamento;
import activity_template.PagamentoCartaoCredito;
import activity_template.PagamentoPaypal;

public class SistemaPagamento {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartaoCredito();
        pagamentoCartao.realizarPagamento();

        System.out.println();

        Pagamento pagamentoPaypal = new PagamentoPaypal();
        pagamentoPaypal.realizarPagamento();
    }
}
