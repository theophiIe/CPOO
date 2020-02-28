import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Document ici.
 *
 * @author (votre nom)
 * @version (14/02/2020)
 */
public class Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre;
    private String auteur;
    private int annee;
    private List<Document> ref;
    
    /**
     * Constructeur d'objets de classe Document
     */
    public Document(String titre, String auteur, int annee)
    {
        // initialisation des variables d'instance
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        ref = new ArrayList<Document>();
    }

    public void ajoutRef(Document doc)
    {
        this.ref.add(doc);
    }
    
    public boolean ajoutBibli(Bibliotheque bibliotheque)
    {
        return bibliotheque.ajoutDocument(this);
    }
    
    public void afficheDocument()
    {
        
    }
}
