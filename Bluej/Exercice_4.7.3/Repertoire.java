import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Repertoire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Repertoire
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private List<Repertoire> dossier;
    private int taille_arbo;
    /**
     * Constructeur d'objets de classe Repertoire
     */
    public Repertoire(String nom)
    {
        // initialisation des variables d'instance
        dossier = new ArrayList<Repertoire>();
        this.nom = nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void Add(Fichier fichier)
    {
        this.dossier.add(fichier);
        taille_arbo = taille_arbo + fichier.taille;
        System.out.println("Ajout à la liste d'un fichier");
    }
    
    public void Add(Repertoire rep)
    {
        this.dossier.add(rep);
        System.out.println("Ajout à la liste d'un repertoire");
    }
    
    public void TailleArborescence()
    {
        System.out.println("Taille de l'arborescence : " + taille_arbo);
    }
    
    public void AfficheArborescence()
    {
        System.out.println("La liste contient : ");
        
        for(int i=0; i<dossier.size(); i++)
        {
            System.out.println(dossier.get(i).toString());
        }
    }
}
