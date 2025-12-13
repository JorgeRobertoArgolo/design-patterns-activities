package activity_strategy.test;

import activity_strategy.EnvioEmail;
import activity_strategy.EnvioPush;
import activity_strategy.EnvioSMS;
import activity_strategy.Notificador;

public class SistemaNotificacoes {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Notificações (Padrão Strategy) ---");

        Notificador notificador = new Notificador();

        /*
        * Usando E-mail
        * */
        notificador.setEstrategiaEnvio(new EnvioEmail());

        String email = "usuario@gmail.com";
        String msgEmail = "Olá! Este é um e-mail de teste.";

        notificador.notificar(email, msgEmail);

        /*
        * Troca para SMS (Troca de Estratégia em Runtime)
        * */
        notificador.setEstrategiaEnvio(new EnvioSMS());

        String telefone = "+5574999999999";
        String msgSMS = "Olá! Este é um SMS de teste.";

        notificador.notificar(telefone, msgSMS);

        /*
        * Troca para Push Notification
        * */
        notificador.setEstrategiaEnvio(new EnvioPush());

        String userID = "UsuarioTeste";
        String msgPush = "Olá! Esta é uma notificação push de teste.";

        notificador.notificar(userID, msgPush);
    }
}
