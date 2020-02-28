/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (07/02/2020 TD2)
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int decalage;
    private String chaine;
  
    public static ChaineCryptee deCryptee(int decalage, String chaineCrypte)
    {
        return new ChaineCryptee(decalage, chaineCrypte);
    }
    
    public static ChaineCryptee deEnClair(int decalage,String chaineClair)
    {
        return new ChaineCryptee(decalage, chaineClair);
    }
    
    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    private ChaineCryptee(int decalage,String chaine)
    {
        // initialisation des variables d'instance
        this.decalage = decalage;
        this.chaine = chaine;
    }
    
    /**
     * Méthode qui permet de décrypter un chaine de caractère
     *
     * @return     La chaine decrypté
     */
    public String decrypte()
    {
        String chaineDecrypte = "";
        
        if(chaine == null || chaine.length() == 0)
        {
            System.out.println("Erreur le mot est vide");
        }
        
        else
        {
            for (int i=0; i<chaine.length(); i++)
            {
                chaineDecrypte = chaineDecrypte + decaleCaractere(chaine.charAt(i),-decalage);
            } 
        }
        return chaineDecrypte;
    }
    
    /**
     * Méthode qui permet de de décaler chaque caracter de la chaine de caratere
     *
     * @param c le caratere à décaler
     * @param decalage decalage du caractere 
     * @return     La chaine decrypté
     */
    private static char decaleCaractere(char c, int decalage) 
    {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
    
    /**
     * Méthode qui permet de crypter un chaine de caractère
     *
     * @return     La chaine crypté
     */
    public String crypte()
    {
        String chaineCrypte = "";
        
        if(chaine == null || chaine.length() == 0)
        {
            System.out.println("Erreur le mot est vide");
        }
        
        else
        {
            for (int i=0; i<chaine.length(); i++)
            {
                chaineCrypte = chaineCrypte + decaleCaractere(chaine.charAt(i),decalage);
            } 
        }
        return chaineCrypte;
    }
}
