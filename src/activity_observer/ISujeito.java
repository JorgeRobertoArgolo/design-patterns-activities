package activity_observer;

public interface ISujeito {
    void fazerInscricao(IObservador observador);
    void cancelarInscricao(IObservador observador);
    void notificarObservadores(String mensagem);
}
