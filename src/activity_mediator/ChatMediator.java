package activity_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private List<Usuario> usuarios;

    public ChatMediator() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remetente) {
                usuario.receber(mensagem);
            }
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
}
