package activity_builder.test;

import activity_builder.Director;
import activity_builder.RelatorioHTMLBuilder;
import activity_builder.RelatorioPDFBuilder;
import activity_builder.RelatorioWordBuilder;

public class SistemaFinanceiroBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        // Dados Comuns
        String titulo = "Relatório Anual de Desempenho (2024)";
        String corpo = "Resumo executivo das transações mais relevantes do último trimestre.";
        String graficos = "Dados de fluxo de caixa";
        String rodape = "Elaborado pelo Depto. Financeiro.";

        System.out.println("--- CRIAÇÃO DO RELATÓRIO 1: COMPLETO em PDF ---");
        RelatorioPDFBuilder pdfBuilder = new RelatorioPDFBuilder();

        // O Director usa o Builder de PDF para construir o Relatório Completo
        director.buildCompleteReport(pdfBuilder, titulo, corpo, graficos, rodape);
        pdfBuilder.relatorio().showReports();

        System.out.println("\n--- CRIAÇÃO DO RELATÓRIO 2: SIMPLES em HTML ---");
        RelatorioHTMLBuilder htmlBuilder = new RelatorioHTMLBuilder();

        // O Director usa o Builder de HTML para construir o Relatório Simples
        director.buildSimpleReport(htmlBuilder, titulo, corpo);
        htmlBuilder.relatorio().showReports();

        System.out.println("\n--- CRIAÇÃO DO RELATÓRIO 3: COMPLETO em WORD ---");
        RelatorioWordBuilder wordBuilder = new RelatorioWordBuilder();

        // O Director usa o Builder de Word para construir o Relatório Completo
        director.buildCompleteReport(wordBuilder, titulo, corpo, graficos, rodape);
        wordBuilder.relatorio().showReports();
    }
}
