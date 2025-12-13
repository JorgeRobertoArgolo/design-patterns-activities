package activity_chain_of_responsibility;

public class AtendenteConsulta extends AtendenteBase{
    private final String TIPO = "Consulta";


    @Override
    protected boolean podeAtenderSolicitacao(Solicitacao solicitacao) {
        return solicitacao.getTipo().equalsIgnoreCase(TIPO);
    }

    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        if (podeAtenderSolicitacao(solicitacao)) {
            System.out.println("[ATENDENTE CONSULTA] Atendente de Consulta: " + solicitacao.getMensagem());
        } else {
            /***
             * Passa para o próximo atendente ou senão tiver mais atendentes,
             * informa que não tem ninguém disponível para atender
             */
            super.processarSolicitacao(solicitacao);
        }
    }
}
