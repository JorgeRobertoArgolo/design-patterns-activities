package activity_template;

public abstract class Pagamento {
    public final void realizarPagamento() {
        validarInformacoes();
        processarPagamento();
        enviarConfirmacao();
    }

    protected abstract void validarInformacoes();
    protected abstract void processarPagamento();

    protected void enviarConfirmacao() {
        System.out.println("Confirmação de pagamento enviada.");
    }
}
