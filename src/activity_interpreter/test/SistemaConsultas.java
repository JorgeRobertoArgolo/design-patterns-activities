package activity_interpreter.test;

import activity_interpreter.ConsultaSelect;
import activity_interpreter.ConsultaWhere;
import activity_interpreter.Contexto;
import activity_interpreter.IExpressao;

public class SistemaConsultas {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        IExpressao select = new ConsultaSelect();
        select.interpretar(contexto);

        System.out.println();

        IExpressao where = new ConsultaWhere("calça");
        where.interpretar(contexto);
    }
}
