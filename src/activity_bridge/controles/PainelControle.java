package activity_bridge.controles;

import activity_bridge.Controle;
import activity_bridge.IDispositivo;

public class PainelControle extends Controle {

    public PainelControle(IDispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void iniciarRotina() {
        System.out.println("\n[INFO] Painel de parede com display ativado. Iniciando interface de usuário.");
    }
}
