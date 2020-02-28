
/**
 * Décrivez votre classe Dvd ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Dvd extends Titre
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String realisateur;
    private int annee;

    /**
     * Constructeur d'objets de classe Dvd
     */
    public Dvd(String titre, String real, int annee)
    {
        super.titre = titre;
        this.realisateur = real;
        this.annee = annee;
    }
    
    public String getRealisateur()
    {
        return realisateur;
    }
    
    public String toString()
    {
        return("DVD : [ "+this.titre+", "+this.realisateur+", "+this.annee+" ]\n");
    }
}
