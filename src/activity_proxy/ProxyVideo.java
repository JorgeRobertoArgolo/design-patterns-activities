package activity_proxy;

public class ProxyVideo implements IVideo {

    private VideoReal videoReal;
    private String nomeFilme;
    private boolean usuarioAutenticado;
    private String permissaoNecessaria;

    public ProxyVideo(String nomeFilme, boolean usuarioAutenticado, String permissaoNecessaria) {
        this.nomeFilme = nomeFilme;
        this.usuarioAutenticado = usuarioAutenticado;
        this.permissaoNecessaria = permissaoNecessaria;
        System.out.println("[PROXY] Proxy de video para criado para o filme : " + this.nomeFilme);
    }

    /**
     * Verifica a permissão e só carrega o objeto real (VideoReal) se necessário.
     */
    @Override
    public void carregar() {
        if (this.usuarioAutenticado) {
            if (this.permissaoNecessaria.equals("PREMIUM")) {
                if (this.videoReal == null) {
                    this.videoReal = new VideoReal(this.nomeFilme);
                    this.videoReal.carregar();
                } else {
                    System.out.println("[PROXY] Conteúdo já foi carregado. Pulando operação de carregamento.: " + this.nomeFilme);
                }
            } else {
                System.out.println("[PROXY] Acesso NEGADO. Sua permissão : [" + permissaoNecessaria + "] é insuficiente para isso.");
            }
        } else {
            System.out.println("[PROXY] Acesso NEGADO. Usuário não está autenticado, logo o carregamento não será feito. Tente novamente" +
                    " depois de se autenticar.");
        }
    }

    @Override
    public void exibir() {
        if (this.videoReal != null) {
            videoReal.exibir();
        } else {
            System.out.println("[PROXY] O filme não pode ser exibido, pois não foi carregado, verifique sua autenticação" +
                    " ou se estiver autenticado, assine nosso plano premium.");
        }
    }
}
