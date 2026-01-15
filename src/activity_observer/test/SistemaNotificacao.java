package activity_observer.test;

import activity_observer.Projeto;
import activity_observer.Usuario;

public class SistemaNotificacao {
    public static void main(String[] args) {
        Projeto devSoftware = new Projeto("Desenvolvimento de Software");

        Usuario alice = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");

        devSoftware.fazerInscricao(alice);
        devSoftware.fazerInscricao(bob);

        devSoftware.atualizarStatus("Adicionadas novas funcionalidades ao sistema.");

        devSoftware.cancelarInscricao(bob);

        devSoftware.atualizarStatus("Correção de bugs realizados.");
    }
}
