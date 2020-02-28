
/**
 * Décrivez votre classe DVD ici.
 *
 * @author (votre nom)
 * @version (28/02/2020)
 */
public class DVD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String realisateur;
    private int sortie;

    /**
     * Constructeur d'objets de classe DVD
     */
    public DVD(String titre, String realisateur, int sortie)
    {
        // initialisation des variables d'instance
        super(titre);
        this.realisateur = realisateur;
        this.sortie = sortie;
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     les informations 
     */
    public String toString()
    {
        return super.getTitre() + " " + realisateur +  " " + sortie;
    }
}
