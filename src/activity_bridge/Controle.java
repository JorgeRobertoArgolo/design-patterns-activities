package activity_bridge;

public abstract class Controle {
    protected IDispositivo dispositivo;

    public Controle(IDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligar() {
        System.out.print("Acionando " + dispositivo.getTipo() + " via " + this.getClass().getSimpleName() + ": ");
        dispositivo.ligar();
    }

    public void desligar() {
        System.out.print("Desligando " + dispositivo.getTipo() + " via " + this.getClass().getSimpleName() + ": ");
        dispositivo.desligar();
    }

    public abstract void iniciarRotina();
}
