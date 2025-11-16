package activity_prototype.tests;

import activity_prototype.Clausula;
import activity_prototype.Contrato;

public class SistemaDocumentos {
    public static void main(String[] args) {

        // --- 1. CRIAÇÃO DO PROTÓTIPO BASE ---
        System.out.println("--- 1. CRIANDO PROTÓTIPO BASE (CONTRATO PADRÃO) ---");
        Contrato contratoBase = new Contrato(
                "CONTRATO DE PRESTAÇÃO DE SERVIÇOS PADRÃO v1.0",
                "Este contrato estabelece os termos e condições gerais entre as partes, sendo o corpo do documento imutável para a maioria dos clientes.",
                "Todos os direitos reservados - Versão 1.0"
        );
        contratoBase.addClause(new Clausula(1, "Cláusula 1: Confidencialidade mantida por 5 anos."));
        contratoBase.addClause(new Clausula(2, "Cláusula 2: Pagamento em até 30 dias após a emissão."));

        System.out.println("PROTÓTIPO BASE:");
        contratoBase.exibirDetalhes();

        // --- 2. CRIAÇÃO E PERSONALIZAÇÃO DE CLONES ---

        try {
            // --- CLONE 1: Contrato para Cliente A ---
            System.out.println("\n--- 2. CLONANDO PARA O CLIENTE 'A' ---");
            Contrato contratoClienteA = contratoBase.clonar(); // CLONAGEM (PROTOTYPE)

            // PERSONALIZAÇÃO do clone:
            contratoClienteA.setTitle("PROPOSTA COMERCIAL ESPECIAL | CLIENTE A");
            contratoClienteA.getClauses().get(1).setText("Cláusula 2: Pagamento em até 60 dias (NEGOCIADO).");
            contratoClienteA.setBody("O corpo foi ligeiramente alterado para incluir o orçamento.");

            System.out.println("CONTRATO CLIENTE A (Clone 1):");
            contratoClienteA.exibirDetalhes();

            // --- CLONE 2: Contrato para Cliente B ---
            System.out.println("\n--- 3. CLONANDO PARA O CLIENTE 'B' ---");
            Contrato contratoClienteB = contratoBase.clonar();

            // PERSONALIZAÇÃO do clone:
            contratoClienteB.setTitle("CONTRATO DE MANUTENÇÃO SIMPLIFICADO");
            contratoClienteB.addClause(new Clausula(3, "Cláusula 3: Exclusão de garantia de software legado."));

            System.out.println("CONTRATO CLIENTE B (Clone 2):");
            contratoClienteB.exibirDetalhes();

            // --- 4. VERIFICAÇÃO FINAL ---
            System.out.println("\n--- 4. VERIFICANDO SE O PROTÓTIPO BASE FOI ALTERADO ---");

            // O protótipo base DEVE estar inalterado
            contratoBase.exibirDetalhes();

            System.out.println("Verificação do Protótipo Base (Cláusula 2): " + contratoBase.getClauses().get(1).getText());
            System.out.println("Verificação do Cliente A (Cláusula 2): " + contratoClienteA.getClauses().get(1).getText());

        } catch (CloneNotSupportedException e) {
            System.err.println("Erro ao clonar o documento: " + e.getMessage());
        }
    }
}
