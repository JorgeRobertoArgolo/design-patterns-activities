package activity_proxy.tests;

import activity_proxy.IVideo;
import activity_proxy.ProxyVideo;

public class SistemaStreaming {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Streaming (Padrão Proxy) ---");

        String filmeA = "O Senhor dos Anéis: A Sociedade do Anel";
        String filmeB = "Documentário Curto Gratuito";

        // =========================================================
        // CENÁRIO 1: Usuário NÃO AUTENTICADO (Acesso negado e carregamento evitado)
        System.out.println("\n===== CENÁRIO 1: USUÁRIO VISITANTE (NÃO AUTENTICADO) =====");
        IVideo visitanteProxy = new ProxyVideo(filmeA, false, "BASICO");

        // O carregamento (operação custosa) será evitado aqui
        visitanteProxy.carregar();
        visitanteProxy.exibir();

        // =========================================================
        // CENÁRIO 2: Usuário AUTENTICADO, mas sem PERMISSÃO PREMIUM
        System.out.println("\n===== CENÁRIO 2: USUÁRIO PREMIUM NECESSÁRIO =====");
        IVideo usuarioBasicoProxy = new ProxyVideo(filmeA, true, "BASICO");

        // O carregamento será evitado aqui devido à permissão insuficiente
        usuarioBasicoProxy.carregar();
        usuarioBasicoProxy.exibir();

        // =========================================================
        // CENÁRIO 3: Usuário AUTENTICADO COM PERMISSÃO (Acesso liberado e carregamento realizado)
        System.out.println("\n===== CENÁRIO 3: ACESSO TOTAL PERMITIDO (PREMIUM) =====");
        IVideo usuarioPremiumProxy = new ProxyVideo(filmeA, true, "PREMIUM");

        // Primeira chamada: Carregamento do recurso custoso (VideoReal)
        usuarioPremiumProxy.carregar();
        usuarioPremiumProxy.exibir();

        // Segunda chamada (reutilização): Demonstra a inicialização preguiçosa
        System.out.println("\n--- Segunda tentativa de carregamento ---");
        usuarioPremiumProxy.carregar();
    }
}
