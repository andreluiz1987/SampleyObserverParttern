package detectordocumento.mercantildobrasil.com.br.appsampleyobserverparttern;

/**
 * Created by andre.coelho on 29/03/2018.
 */

public interface RepositoryObserver {
    void onUserDataChanged(String fullname, int age);
}
