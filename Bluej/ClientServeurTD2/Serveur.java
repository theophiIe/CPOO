import java.util.ArrayList;
import java.util.List;

/**
 * Décrivez votre classe Serveur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Serveur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Client> user;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public void Serveur()
    {
        
    }

    public boolean connecter(Client client)
    {
        user.add(client);
        return true;
    }
    
    public void diffuser(String message)
    {
    
    }
}
