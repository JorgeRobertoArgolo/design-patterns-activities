package activity_singleton;

public class SistemaFinanceiro {
    public static void main(String[] args) {
        System.out.println("--- Sistema Financeiro - Teste do Padrão Singleton ---");

        // Primeira solicitação de conexão
        System.out.println("\n--- MÓDULO 1: Transações ---");

        // A conexão é obtida através do métoodo getInstance()
        ConexaoBD conexaoModulo1 = ConexaoBD.getInstance();
        System.out.println("Status M1: " + conexaoModulo1.getStatus());
        conexaoModulo1.executeCommand("INSERT INTO contas VALUES (...)");

        // --------------------------------------------------------------------------------

        // Segunda solicitação de conexão
        System.out.println("\n--- MÓDULO 2: Relatórios ---");

        // O Singleton retorna a instância existente, da para confirmar vendo o hashcode.
        ConexaoBD conexaoModulo2 = ConexaoBD.getInstance();
        System.out.println("Status M2: " + conexaoModulo2.getStatus());
        conexaoModulo2.executeCommand("SELECT * FROM relatorios WHERE data > '2020'");

    }
}
