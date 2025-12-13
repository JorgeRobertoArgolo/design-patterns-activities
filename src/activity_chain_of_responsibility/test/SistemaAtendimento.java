package activity_chain_of_responsibility.test;

import activity_chain_of_responsibility.*;

public class SistemaAtendimento {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Atendimento (Chain of Responsibility) ---");

        /*
         * 1. Cria os Atendentes
         */
        IAtendente consulta = new AtendenteConsulta();
        IAtendente reclamacao = new AtendenteReclamacao();
        IAtendente sugestao = new AtendenteSugestao();

        /*
         * 2. Criando cadeia de responsabilidade
         * Consulta -> Reclamação -> Sugestão
         * OBS: Sugestao não tem sucessor (o AtendenteBase cuida do final da cadeia)
         */
        consulta.setProximoAtendente(reclamacao);
        reclamacao.setProximoAtendente(sugestao);

        /*
         * 3. Cria as solicitações
         */
        Solicitacao s1 = new Solicitacao("Consulta", "Qual é o horário de funcionamento?");
        Solicitacao s2 = new Solicitacao("Reclamacao", "O produto veio danificado.");
        Solicitacao s3 = new Solicitacao("Sugestao", "Sugiro que aumentem o horário de atendimento.");
        Solicitacao s4 = new Solicitacao("SuporteTecnico", "Meu app travou."); // Tipo não suportado atualmente

        System.out.println("\n--- Enviando Solicitação 1 (Consulta) ---");
        consulta.processarSolicitacao(s1);

        System.out.println("\n--- Enviando Solicitação 2 (Reclamação) ---");
        consulta.processarSolicitacao(s2);

        System.out.println("\n--- Enviando Solicitação 3 (Sugestão) ---");
        consulta.processarSolicitacao(s3);

        System.out.println("\n--- Enviando Solicitação 4 (Tipo Desconhecido) ---");
        consulta.processarSolicitacao(s4);
    }
}
