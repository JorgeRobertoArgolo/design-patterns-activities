package activity_command;

public class ComandoDesligar implements IComando{

    private Dispositivo dispositivo;

    public ComandoDesligar(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void executar() {
        dispositivo.desligar();
    }

    @Override
    public void desfazer() {
        dispositivo.ligar();
    }
}
