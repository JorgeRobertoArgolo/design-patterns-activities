package activity_bridge.dispositivos;

import activity_bridge.IDispositivo;

public class Ventilador implements IDispositivo {

    @Override
    public void ligar() {
        System.out.println("[VENTILADOR] Ligado e rodando ventilador");
    }

    @Override
    public void desligar() {
        System.out.println("[VENTILADOR] Desligando...");
    }

    @Override
    public String getTipo() {
        return "Ventilador";
    }
}
