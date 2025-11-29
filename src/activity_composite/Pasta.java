package activity_composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements IComponenteArquivo {

    private String nome;

    private List<IComponenteArquivo> componentes;

    public Pasta(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionarComponente(IComponenteArquivo componente) {
        System.out.println("[PASTA] Adicionando componente " +  componente.getNome() + " na pasta " + this.getNome());
        componentes.add(componente);
    }

    public void removerComponente(IComponenteArquivo componente) {
        System.out.println("[PASTA] Removendo componente " +  componente.getNome() + " da pasta " + this.getNome());
        componentes.remove(componente);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println("[PASTA] " + this.getNome());
        String novaIndentacao = indentacao + " ";

        for (IComponenteArquivo componente : componentes) {
            componente.exibir(novaIndentacao);
        }
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
