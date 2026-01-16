package activity_memento;

public class Memento {
    private final String estado;

    public Memento (String estado) {
        this.estado = estado;
    }

    public String getEstadoSalvo () {
        return this.estado;
    }
}
