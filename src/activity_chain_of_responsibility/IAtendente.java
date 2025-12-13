package activity_chain_of_responsibility;

public interface IAtendente {
    void setProximoAtendente(IAtendente proximoAtendente);
    void processarSolicitacao(Solicitacao solicitacao);
}
