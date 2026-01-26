package activity_interpreter;

import java.util.ArrayList;
import java.util.List;

public class Contexto {
    private List<String> dados;
    private List<String> resultado;

    public Contexto() {
        this.dados = new ArrayList<>();
        this.resultado = new ArrayList<>();

        // Simulação de dados: "produto:preco"
        dados.add("produto:camiseta;preco:29.99");
        dados.add("produto:calça;preco:49.99");
        dados.add("produto:tênis;preco:89.90");
    }

    public List<String> getDados() {
        return dados;
    }

    public List<String> getResultado() {
        return resultado;
    }

    public void setResultado(List<String> resultado) {
        this.resultado = resultado;
    }
}
