
/**
 * Décrivez votre classe CD ici.
 *
 * @author (votre nom)
 * @version (28/02/2020)
 */
public class CD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String artiste;
    private int nbrTitre;

    /**
     * Constructeur d'objets de classe CD
     */
    public CD(String titre, String artiste, int nbrTitre)
    {
        // initialisation des variables d'instance
        super(titre);
        this.artiste = artiste;
        this.nbrTitre = nbrTitre;
    }
    
    /**
     * toString - permet d'avoir les informations d'un cd
     *
     * @return     info d'un CD
     */
    public String toString()
    {
        return super.getTitre() + " " + artiste + " " + nbrTitre;
    }
}
