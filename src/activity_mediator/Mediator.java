package activity_mediator;

public interface Mediator {
    void enviarMensagem(String mensagem, Usuario remetente);
    void adicionarUsuario(Usuario usuario);
}
