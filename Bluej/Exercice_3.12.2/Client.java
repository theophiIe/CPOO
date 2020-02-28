
/**
 * classe Client
 *
 * @version (14/02/2020)
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private Serveur serveur;
    
    /**
     * Constructeur d'objets de classe Client
     * 
     * @param nom String
     */
    public Client(String nom)
    {
        this.nom=nom;
    }
    
    /**
     * methode envoyer
     *
     * @param message String
     */
    public void envoyer(String message)
    {
        if(this.serveur != null) 
        {
            serveur.diffuser(message);
        }
    }
    
    /**
     * méthode recevoir
     *
     * @param message String
     */
    public void recevoir(String message)
    {
        System.out.println(message);
    }
    
    /**
     * méthode seConnecter
     *
     * @return boolean 
     * @param serveur Serveur
     */
    public boolean seConnecter(Serveur serveur)
    {
        this.serveur = serveur;
        return serveur.connecter(this);
    }
}
