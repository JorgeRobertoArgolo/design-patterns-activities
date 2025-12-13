package activity_strategy;

public class Notificador {
    private IEstrategiaEnvio estrategiaEnvio;

    public void setEstrategiaEnvio(IEstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
        System.out.println("\n[NOTIFICADOR] Estratégia de envio agora é " + estrategiaEnvio);
    }

    public void notificar (String destinatario, String mensagem) {
        if (estrategiaEnvio != null) {
            estrategiaEnvio.enviar(destinatario, mensagem);
            return;
        }
        System.out.println("[ERRO] Nenhuma estratégia de envio foi definida.");
        return;
    }
}
