package activity_observer;

import java.util.ArrayList;
import java.util.List;

public class Projeto implements ISujeito{

    private String nome;
    private List<IObservador> observadores = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerInscricao(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void cancelarInscricao(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (IObservador observador: observadores) {
            observador.atualizar(this.nome, mensagem);
        }
    }

    public void atualizarStatus (String novaAtualizacao) {
        System.out.println("\nAtualizando o projeto: " + novaAtualizacao);
        notificarObservadores(novaAtualizacao);
    }
}
