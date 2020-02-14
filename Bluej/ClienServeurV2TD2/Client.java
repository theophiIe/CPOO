
/**
 * classe Client
 *
 * @version (14/02/2020)
 */
public class Client
{
    private String nom;
    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        System.out.println("Création du client " + nom);
        this.nom = nom;
    }

    /**
     * méthode seConnecter
     *
     * @return boolean 
     * @param serveur Serveur
     */
    public boolean seConnecter(Serveur serveur)
    {
        System.out.println("Client" + nom + ": Demande de connexion");// initialisation des variables d'instance
        return serveur.connecter(this);
    }
    
    /**
     * methode envoyer
     *
     * @param message String
     */
    public void envoyer(String message, Serveur serveur)
    {
        System.out.println("Client " + nom + " : envoi du message " + message);
        serveur.diffuser(this, message);
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
     * méthode toString
     *
     * @return nom String
     */
    public String toString()
    {
        return nom;
    }
}
    