package activity_command;

import java.util.Stack;

public class ControleRemoto {
    private Stack<IComando> historicoComandos = new Stack<>();

    public void pressionarEnviarComando(IComando comando){
        comando.executar();
        historicoComandos.push(comando);
    }

    public void pressionarDesfazerComando () {
        if (!historicoComandos.isEmpty()){
            IComando ultimoComando = historicoComandos.pop();
            ultimoComando.desfazer();
        }
    }

}
