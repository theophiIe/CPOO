/**
 * classe NomMachine
 *
 * @version (25/04/20)
 */
public class NomMachine
{
    private String machine = null;

    /**
     * Constructeur de la classe NomMachine
     *
     * @param machine
     */
    public NomMachine(String machine)
    {
        this.machine = machine;
    }

    /**
     * Methode Override permettant
     * de return un nom machine
     *
     * @return String machine
     */
    @Override
    public String toString()
    {
        return this.machine;
    }
}
