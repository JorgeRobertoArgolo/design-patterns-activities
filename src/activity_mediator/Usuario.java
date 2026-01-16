package activity_mediator;

public class Usuario {
    protected Mediator mediador;
    protected String nome;

    public Usuario(Mediator mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public void enviar(String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    public void receber(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }
}
