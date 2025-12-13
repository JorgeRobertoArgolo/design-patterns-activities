package activity_iterator;

public interface Iterator {
    //Verifica se tem mais elementos
    boolean temProximo();

    //Retorna o próximo elemento
    Object proximo();
}
