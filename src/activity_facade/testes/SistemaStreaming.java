package activity_facade.testes;

import activity_facade.facade.CinemaFacade;

public class SistemaStreaming {
    public static void main(String[] args) {
        System.out.println("===== TESTE DO PADRÃO FACADE: CINEMA ONLINE =====");

        // O cliente só precisa interagir com a classe Facade
        CinemaFacade cinema = new CinemaFacade();

        // --- Cenario A: Sucesso (Login OK, Pagamento OK) ---
        System.out.println("\n[CENÁRIO A: ACESSO PERMITIDO]");
        cinema.assistirFilme("roberto", "123456", "Matrix", 19.99);

        // Finaliza a sessão do primeiro usuário
        cinema.sairESalvarProgresso();

        // --- Cenario B: Falha (Login Incorreto) ---
        System.out.println("\n[CENÁRIO B: LOGIN INCORRETO]");
        cinema.assistirFilme("roberto", "123", "Avatar", 25.00);

        // --- Cenario C: Falha (Pagamento Negado) ---
        System.out.println("\n[CENÁRIO C: PAGAMENTO NEGADO]");
        cinema.assistirFilme("roberto", "123456", "Titanic", -1.00);
    }
}
