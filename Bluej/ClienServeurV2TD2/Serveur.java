import java.util.List;
import java.util.ArrayList;

/**
 * Classe Serveur
 *
 * @version (14/02/2020)
 */
public class Serveur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Client> list;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        // initialisation des variables d'instance
        System.out.println("Création du serveur : Done");
        list = new ArrayList<Client>();
        
    }

    /**
     * méthode recevoir
     *
     * @param client Client
     */
    public boolean connecter(Client client)
    {
        if(this.list.size()<10)
        {
            System.out.println("Demande de connection du client " + client.toString() + " acceptée.");
            this.list.add(client);
            return true;
        }
        else
        {
            System.out.println("Demande de connexion du client " + client.toString() + " refusée.");
            return false;
        }
    }
    
    /**
     * méthode recevoir
     *
     * @param c1 Client
     * @param messag String
     */
    public void diffuser(Client c1, String message)
    {
        System.out.println("Message " + message + " bien reçu de " + c1 + ", je le diffuse.");
        for (Client c : list)// on déclare client c, boucle (pour chaque client c)
        {
            if(!c.equals(c1))// est ce que c'est le client qui s'est envoyé le message à lui-même
            {
                System.out.println("Je suis le client " + c.toString() + " : ");
                c.recevoir(message);
            }
        }
    }
}
