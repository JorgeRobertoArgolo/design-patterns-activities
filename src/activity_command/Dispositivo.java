package activity_command;

public class Dispositivo {
    private String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    public void ligar() {
        System.out.println("O Dispositivo " + this.nome + " foi ligado!");
    }

    public void desligar () {
        System.out.println("O Dispositivo " + this.nome + " foi desligado!");
    }
}
