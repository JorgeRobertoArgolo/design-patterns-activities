package activity_adapter;

public interface IPagamento {
    void processarPagamento(double valor);
    void verificarStatus();
}
