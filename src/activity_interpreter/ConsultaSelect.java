package activity_interpreter;

import java.util.ArrayList;

public class ConsultaSelect implements IExpressao {

    @Override
    public void interpretar(Contexto contexto) {
        contexto.setResultado(new ArrayList<>(contexto.getDados()));
        System.out.println("Resultados da consulta SELECT:");
        for (String item: contexto.getResultado()) {
            System.out.println(item);
        }
    }
}
