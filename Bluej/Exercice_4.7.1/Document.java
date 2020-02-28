import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Document ici.
 *
 * @author (votre nom)
 * @version (28/02/2020)
 */
public class Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Document> collection;
    private String titre;
    
    /**
     * Constructeur d'objets de classe Document
     */
    public Document(String titre)
    {
        // initialisation des variables d'instance
        collection = new ArrayList<Document>();
        this.titre = titre;
    }
    
    /**
     * getTitre - permet d'obtenir titre pour CD et DVD
     *
     * @return     titre
     */
    public String getTitre()
    {
        return titre;
    }
    
    /**
     * getInfoDoc - Affiche les information d'un document cd
     *
     * @param  CD   cd
     */
    public void getInfoDoc(CD cd)
    {
        System.out.println(cd.toString());
    }
    
    /**
     * getInfoDoc - Affiche les informations d'un document dvd
     *
     * @param  DVD   dvd
     */
    public void getInfoDoc(DVD dvd)
    {
        System.out.println(dvd.toString());
    }
    
    /**
     * add_Doc_to_Colletion - Ajoute un document cd à la collection
     *
     * @param  CD   cd
     */
    public void add_Doc_to_Colletion(CD cd)
    {
        this.collection.add(cd);
        System.out.println("ajout d'un document cd à la collection");
    }
    
     /**
     * add_Doc_to_Colletion - Ajoute un document cd à la collection
     *
     * @param  DVD   dvd
     */
    public void add_Doc_to_Colletion(DVD dvd)
    {
        this.collection.add(dvd);
        System.out.println("ajout d'un document dvd à la collection");        
    }
    
    /**
     * allCollection - Affihe tout les elements contenu dans la liste
     *
     */
    public void allCollection()
    {
        System.out.println("La liste contient : ");
        
        for(int i=0; i<collection.size(); i++)
        {
            System.out.println(collection.get(i).toString());
        }
    }
    
    /**
     * recherche - permet de rechercher d'afficher les documents correspondant à une recherche
     *
     * @param  CD  cd
     */
    public void recherche(CD cd)
    {
        
    }
    
       /**
     * recherche - permet de rechercher d'afficher les documents correspondant à une recherche
     *
     * @param  DVD   dvd
     */
    public void recherche(DVD dvd)
    {
        
    }
}
