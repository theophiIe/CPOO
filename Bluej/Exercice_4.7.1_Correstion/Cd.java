
/**
 * Décrivez votre classe Cd ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Cd extends Titre
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nomArtiste;
    private int NbreTitres;

    /**
     * Constructeur d'objets de classe Cd
     */
    public Cd(String titre, String nom, int NbreTitres)
    {
        // initialisation des variables d'instance
        super.titre = titre;
        this.nomArtiste = nom;
        this.NbreTitres = NbreTitres;
    }
    
    public String getnomArtiste()
    {
        return nomArtiste;
    }
    
    public String getTitre()
    {
        return super.titre;
    }
    
    public int getNbreTitres()
    {
        return NbreTitres;
    }
    
    public String toString()
    {
        return ("CD : [ "+super.titre+", "+this.nomArtiste+", "+this.NbreTitres+" ]\n");
    }
}
