package activity_command.test;

import activity_command.ComandoDesligar;
import activity_command.ComandoLigar;
import activity_command.ControleRemoto;
import activity_command.Dispositivo;

public class SistemaControleRemoto {
    public static void main(String[] args) {
        // Criando os dispositivos
        Dispositivo luz = new Dispositivo("Luz");
        Dispositivo ventilador = new Dispositivo("Ventilador");

        ControleRemoto controle = new ControleRemoto();

        controle.pressionarEnviarComando(new ComandoLigar(luz));

        controle.pressionarEnviarComando(new ComandoLigar(ventilador));

        controle.pressionarEnviarComando(new ComandoDesligar(luz));

        controle.pressionarDesfazerComando();

        controle.pressionarDesfazerComando();
    }
}
