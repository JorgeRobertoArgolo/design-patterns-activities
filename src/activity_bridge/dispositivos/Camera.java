package activity_bridge.dispositivos;

import activity_bridge.IDispositivo;

public class Camera implements IDispositivo {
    @Override
    public void ligar() {
        System.out.println("[CÂMERA] Ligada e iniciando monitoramento de segurança.");
    }

    @Override
    public void desligar() {
        System.out.println("[CÂMERA] Desligando câmera...");
    }

    @Override
    public String getTipo() {
        return "Câmera de Segurança";
    }
}
