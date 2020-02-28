import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * Décrivez votre classe Collections ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Collections
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    List list;

    /**
     * Constructeur d'objets de classe Collections
     */
    public Collections()
    {
        // initialisation des variables d'instance
        list = new ArrayList();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void Ajout(Object a)
    {
        if (a.getClass().equals(new Cd().getClass()) ||a.getClass().equals(new Dvd().getClass()))
            list.add(a);
        else
            System.out.println("Probleme d'ajout : vous ne pouvez ajouter qu'un CD ou DVD.\n");
    }
    public void Afficher_Collerction()
    {
        for(Object a : list)// liste qui contient les objets
            System.out.println(a.toString()); // java sait si a est un Cd ou un Dvd grace a toString
    }
    public void Recherche(String mot) // recherche par mot-clé
    {
        for(Object a : list) // on parcourt la liste de CDs et DVDs
        {
            if(a.getClass().equals(new Cd().getClass())) // si on a un CD
            {
                if(((Cd)a).titre.contains(mot) || (((Cd)a).getnomArtiste().contains(mot))) 
                {
                    System.out.println(a.toString()); 
                }
            }
            if(a.getClass().equals(newDvd()).getClass())
            {
                if(((Dvd)a).titre.contains(mot) || ((Dvd)a).getRealisateur().contains(mot))
                {
                    System.out.println(a.toString());
                }
            }
        }
    }
}
