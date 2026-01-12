package activity_command;

public class ComandoLigar implements IComando{

    private Dispositivo dispositivo;

    public ComandoLigar(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void executar() {
        dispositivo.ligar();
    }

    @Override
    public void desfazer() {
        dispositivo.desligar();
    }
}
