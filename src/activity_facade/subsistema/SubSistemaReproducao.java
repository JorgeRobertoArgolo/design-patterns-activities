package activity_facade.subsistema;

public class SubSistemaReproducao {
    public void carregarFilme(String filme) {
        System.out.println("[REPRODUÇÃO] Carregando stream de alta definição para: " + filme);
    }

    public void iniciarReproducao() {
        System.out.println("[REPRODUÇÃO] Vídeo iniciado. Aproveite o filme!");
    }

    public void encerrarReproducao() {
        System.out.println("[REPRODUÇÃO] Reprodução encerrada. Liberando recursos.");
    }
}
