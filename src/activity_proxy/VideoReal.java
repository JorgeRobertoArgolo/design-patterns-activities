package activity_proxy;

public class VideoReal implements IVideo{
    private String nomeFilme;

    public VideoReal(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    @Override
    public void carregar() {
        System.out.println("[RECURSO CUSTOSO] Carregando dados do filme: " + this.nomeFilme);
    }

    @Override
    public void exibir() {
        System.out.println("[EXIBIÇÃO] Exibindo filme: " + this.nomeFilme);
    }
}
