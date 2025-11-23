package activity_facade.subsistema;

public class SubSistemaPagamento {
    public boolean processarPagamento(String filme, double valor) {
        System.out.println("[PAGAMENTO] Processando R$ " + valor + " para o filme: " + filme);
        if (valor > 0) {
            System.out.println("[PAGAMENTO] Transação aprovada e registrada.");
            return true;
        } else {
            System.out.println("[PAGAMENTO] Pagamento negado. Valor inválido.");
            return false;
        }
    }
}
