package activity_interpreter;

import java.util.List;
import java.util.stream.Collectors;

public class ConsultaWhere implements IExpressao {

    private String filtro;

    public ConsultaWhere(String filtro) {
        this.filtro = filtro;
    }

    @Override
    public void interpretar(Contexto contexto) {
        List<String> resultado = contexto.getResultado()
                .stream().filter(dado -> dado.contains(filtro))
                .toList();

        contexto.setResultado(resultado);

        System.out.println("Resultados da consulta WHERE (" + filtro + "):");
        for (String item : contexto.getResultado()) {
            System.out.println(item);
        }
    }
}
