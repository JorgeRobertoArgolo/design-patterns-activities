package activity_strategy;

public class EnvioEmail implements IEstrategiaEnvio{

    @Override
    public void enviar(String destinatario, String mensagem) {
         System.out.println("Enviando E-mail para " + destinatario + ": " + mensagem);
    }
}
