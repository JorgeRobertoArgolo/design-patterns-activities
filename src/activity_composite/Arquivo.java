package activity_composite;

public class Arquivo implements IComponenteArquivo{

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println("[ARQUIVO] Arquivo: " + this.nome);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
