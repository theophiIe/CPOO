import java.util.ArrayList;
import java.util.List;

/**
 * Classe Serveur
 *
 * @version (14/02/2020)
 */
public class Serveur
{
    //Liste des clients connectés au serveur
    private List<Client> user;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public void Serveur()
    {
        this.user = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        this.user.add(client);
        return true;
    }
    
    public void diffuser(String message)
    {
        for(int i=0; i < user.size(); i++)
        {
            user.get(i).recevoir(message);
        }
    }
}
