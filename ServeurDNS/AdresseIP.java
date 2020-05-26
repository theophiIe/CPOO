/**
 * classe AdresseIP
 *
 * @version (25/04/2020)
 */
public class AdresseIP
{
    private String ip = null;

    /**
     * Constructeur de la classe AdresseIP
     *
     * @param ip
     */
    public AdresseIP(String ip)
    {
        this.ip = ip;
    }

    /**
     * Méthode retournant une adresse ip
     *
     * @return String ip
     */
    @Override
    public String toString ()
    {
        return this.ip;
    }

}
