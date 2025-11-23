package activity_bridge.testes;

import activity_bridge.Controle;
import activity_bridge.IDispositivo;
import activity_bridge.controles.AplicativoMovel;
import activity_bridge.controles.ControleRemoto;
import activity_bridge.controles.PainelControle;
import activity_bridge.dispositivos.Camera;
import activity_bridge.dispositivos.Lampada;
import activity_bridge.dispositivos.Ventilador;

public class SistemaAutomacaoResidencial {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Automação Residencial (Padrão Bridge) ---");

        // 1. Instanciando os Dispositivos (Implementações)
        IDispositivo lampada = new Lampada();
        IDispositivo ventilador = new Ventilador();
        IDispositivo camera = new Camera();

        // 2. Instanciando os Controles (Abstrações) e construindo a PONTE

        // Caso 1: Lâmpada controlada pelo Aplicativo Móvel
        Controle appParaLampada = new AplicativoMovel(lampada);
        appParaLampada.iniciarRotina();
        appParaLampada.ligar();
        appParaLampada.desligar();
        ((AplicativoMovel) appParaLampada).exibirNotificacao(); // Usa função específica do Controle

        // Caso 2: Ventilador controlado pelo Controle Remoto
        Controle remotoParaVentilador = new ControleRemoto(ventilador);
        remotoParaVentilador.iniciarRotina();
        remotoParaVentilador.ligar();
        ((ControleRemoto) remotoParaVentilador).mudarModo(); // Usa função específica do Controle
        remotoParaVentilador.desligar();

        // Caso 3: Câmera controlada pelo Painel de Parede
        Controle painelParaCamera = new PainelControle(camera);
        painelParaCamera.iniciarRotina();
        painelParaCamera.ligar();
        painelParaCamera.desligar();

        // Caso 4: Mesmo controle, outro dispositivo (Flexibilidade)
        System.out.println("\n--- TESTE DE FLEXIBILIDADE: REUTILIZANDO O CONTROLE ---");
        Controle painelParaLampada = new PainelControle(lampada);
        painelParaLampada.iniciarRotina();
        painelParaLampada.ligar();
    }
}
