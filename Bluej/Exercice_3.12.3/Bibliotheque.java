import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Bibliotheque ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Bibliotheque
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Document> listDoc;
    
    /**
     * Constructeur d'objets de classe Bibliotheque
     */
    public Bibliotheque()
    {
        // initialisation des variables d'instance
        listDoc = new ArrayList<Document>();
    }

    public boolean ajoutDocument(Document document)
    {
        // Insérez votre code ici
        this.listDoc.add(document);
        System.out.println("Ajout de : " + document + "dans la bibliotheque");
        return true;
    }
    
    /**
     * Recherche par rapport au nom du document
     */
    public void recherche(String nomDocument)
    {
        for(int i=0; i<listDoc.size(); i++)
        {
            if((listDoc.get(i).toString()).equals(nomDocument))
            {
                System.out.println("Le document : " + nomDocument + "est dans la bibliothéque");
                break;
            }
        }
    }
    
    /**
     * Recherche par rapport à une reference
     */
    public void recherche(Document document)
    {
        
    }
}
