package activity_composite.tests;

import activity_composite.Arquivo;
import activity_composite.IComponenteArquivo;
import activity_composite.Pasta;

public class GerenciamentoArquivos {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Gerenciamento de Arquivos ---");

        // 1. Componentes Arquivos
        IComponenteArquivo arquivo1 = new Arquivo("Relatorio.pdf");
        IComponenteArquivo arquivo2 = new Arquivo("Dados.csv");
        IComponenteArquivo arquivo3 = new Arquivo("config.ini");
        IComponenteArquivo arquivoParaRemover = new Arquivo("Temp.log");

        // 2. Componentes Composto Pastas
        Pasta pastaRaiz = new Pasta("Documentos");
        Pasta pastaFinanceiro = new Pasta("Financeiro");
        Pasta pastaBackup = new Pasta("Backup");

        // Pasta Financeiro
        pastaFinanceiro.adicionarComponente(arquivo1);
        pastaFinanceiro.adicionarComponente(arquivo2);

        // Pasta Backup
        pastaBackup.adicionarComponente(arquivo3);
        pastaBackup.adicionarComponente(arquivoParaRemover);

        // Pasta Raiz (Contém Pastas e Arquivos)
        pastaRaiz.adicionarComponente(pastaFinanceiro);
        pastaRaiz.adicionarComponente(pastaBackup);
        pastaRaiz.adicionarComponente(new Arquivo("README.md"));

        System.out.println("\n--- EXIBINDO ESTRUTURA INICIAL ---");

        pastaRaiz.exibir("");

        System.out.println("\n--- REMOVENDO ARQUIVO DE TESTE ---");
        pastaBackup.removerComponente(arquivoParaRemover);

        System.out.println("\n--- EXIBINDO ESTRUTURA APÓS REMOÇÃO ---");
        pastaRaiz.exibir("");
    }
}
