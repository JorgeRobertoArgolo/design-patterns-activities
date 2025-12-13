package activity_strategy;

public class EnvioSMS implements IEstrategiaEnvio{
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}
