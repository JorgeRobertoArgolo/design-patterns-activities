package activity_bridge.dispositivos;

import activity_bridge.IDispositivo;

public class Lampada implements IDispositivo {
    @Override
    public void ligar() {
        System.out.println("[LÂMPADA] Ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("[LÂMPADA] Desligando...");
    }

    @Override
    public String getTipo() {
        return "Lâmpada Inteligente";
    }
}
