package activity_bridge.controles;

import activity_bridge.Controle;
import activity_bridge.IDispositivo;

public class AplicativoMovel extends Controle {

    public AplicativoMovel(IDispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void iniciarRotina() {
        System.out.println("\n[INFO] App Móvel conectado via Wi-Fi. Estado do dispositivo carregado.");
    }

    /**
     * Métodoo específico do Aplicativo
     */
    public void exibirNotificacao() {
        System.out.println("Comando: Enviando notificação para o smartphone.");
    }
}
