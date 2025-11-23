package activity_bridge.controles;

import activity_bridge.Controle;
import activity_bridge.IDispositivo;

public class ControleRemoto extends Controle {

    public ControleRemoto(IDispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void iniciarRotina() {
        System.out.println("\n[INFO] Controle Remoto ativado. Pronto para enviar comandos.");
    }

    /**
     * Métodoo exclusivo do controle remoto
     */
    public void mudarModo () {
        System.out.println("Comando: Mudando modo de operação no controle remoto.");
    }
}
