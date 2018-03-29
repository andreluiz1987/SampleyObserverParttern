package detectordocumento.mercantildobrasil.com.br.appsampleyobserverparttern;

/**
 * Created by andre.coelho on 29/03/2018.
 */

public interface Subject {
    void registerObserver(RepositoryObserver repositoryObserver);
    void removeObserver(RepositoryObserver  repositoryObserver);
    void notifyObserver();
}
