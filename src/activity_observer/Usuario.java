package activity_observer;

public class Usuario implements IObservador {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProjeto, String mensagem) {
        System.out.println(
                nome + " recebeu notificação: O projeto '" + nomeProjeto + "' foi atualizado: " + mensagem
        );
    }
}
