package activity_chain_of_responsibility;

public class AtendenteReclamacao extends AtendenteBase{
    private final String TIPO = "Reclamacao";


    @Override
    protected boolean podeAtenderSolicitacao(Solicitacao solicitacao) {
        return solicitacao.getTipo().equalsIgnoreCase(TIPO);
    }

    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        if (podeAtenderSolicitacao(solicitacao)) {
            System.out.println("[ATENDENTE RECLAMACAO] Atendente de Reclamação: " + solicitacao.getMensagem());
        } else {
            /***
             * Passa para o próximo atendente ou senão tiver mais atendentes,
             * informa que não tem ninguém disponível para atender
             */
            super.processarSolicitacao(solicitacao);
        }
    }
}
