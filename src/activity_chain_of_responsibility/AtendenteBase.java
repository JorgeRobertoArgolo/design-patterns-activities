package activity_chain_of_responsibility;

public abstract class AtendenteBase implements IAtendente{

    protected IAtendente proximoAtendente;

    @Override
    public void setProximoAtendente(IAtendente proximoAtendente) {
        this.proximoAtendente = proximoAtendente;
    }

    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        if (this.proximoAtendente != null) {
            proximoAtendente.processarSolicitacao(solicitacao);
        } else {
            System.out.println("[ATENDENTE BASE] Solicitação de " +
                    solicitacao.getTipo() + " ('" + solicitacao.getMensagem() +
                    "') não pôde ser atendida por nenhum atendente.");
        }
    }

    protected abstract boolean podeAtenderSolicitacao(Solicitacao solicitacao);
}
