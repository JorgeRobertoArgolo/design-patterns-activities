package activity_adapter.externa.api;

/**
 * A api tem que ter uma interface incompatível, e será corrigida pelo adapter.
 * */
public class APIServicePayPal {
    public void efetuarTransacao(double valor, String tokenAcesso) {
        System.out.println("[PAYPAL API] Iniciando transação PayPal para R$ " + valor);
        System.out.println("[PAYPAL API] Autenticando com token: " + tokenAcesso);
    }

    public boolean verificarConexao () {
        System.out.println("[PAYPAL API] Verificando conexão de serviço...");
        return true;
    }
}
