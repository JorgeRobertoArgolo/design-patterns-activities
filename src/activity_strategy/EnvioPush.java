package activity_strategy;

public class EnvioPush implements IEstrategiaEnvio{
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando Notificação Push para " + destinatario + ": " + mensagem);
    }
}
