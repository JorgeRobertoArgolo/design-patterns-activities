package activity_prototype;

public interface IDocumento extends Cloneable{
    /**
     * @return an object's copy
     * @throws CloneNotSupportedException If cloning is not supported
     */
    IDocumento clonar() throws CloneNotSupportedException;

    void exibirDetalhes();
}
