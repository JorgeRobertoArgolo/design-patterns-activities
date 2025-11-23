package activity_facade.facade;

import activity_facade.subsistema.SubSistemaLogin;
import activity_facade.subsistema.SubSistemaPagamento;
import activity_facade.subsistema.SubSistemaReproducao;

public class CinemaFacade {
    // O Facade contém instâncias dos subsistemas
    private SubSistemaLogin login;
    private SubSistemaPagamento pagamento;
    private SubSistemaReproducao reproducao;

    public CinemaFacade() {
        // Inicializa todos os subsistemas internos
        this.login = new SubSistemaLogin();
        this.pagamento = new SubSistemaPagamento();
        this.reproducao = new SubSistemaReproducao();
    }

    /**
     * Oferece uma interface simples para a operação completa do usuário.
     * Esconde a complexidade de múltiplos passos e decisões.
     */
    public void assistirFilme(String usuario, String senha, String filme, double valor) {
        System.out.println("--- INICIANDO PROCESSO COMPLETO: ASSISTIR FILME (" + filme + ") ---");

        // 1. Login
        if (!login.fazerLogin(usuario, senha)) {
            System.out.println("FALHA: Não é possível continuar sem autenticação.");
            return;
        }

        // 2. Pagamento
        if (!pagamento.processarPagamento(filme, valor)) {
            System.out.println("FALHA: Pagamento falhou. Não é possível reproduzir o filme.");
            return;
        }

        // 3. Reprodução
        reproducao.carregarFilme(filme);
        reproducao.iniciarReproducao();

        System.out.println("--- PROCESSO CONCLUÍDO COM SUCESSO. ---");
    }

    /**
     * Exemplo de métodoo de limpeza
     */
    public void sairESalvarProgresso() {
        System.out.println("\n--- SAINDO DO SISTEMA ---");
        reproducao.encerrarReproducao();
    }
}
