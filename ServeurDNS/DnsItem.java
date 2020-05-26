/**
 * classe DnsItem
 *
 * @version (25/04/20)
 */
public class DnsItem
{
    private AdresseIP ip;
    private NomMachine machine;

    /**
     * Constructeur de la classe DnsItem
     *
     * @param ip
     * @param machine
     */
    public DnsItem(AdresseIP ip, NomMachine machine)
    {
        this.ip = ip;
        this.machine = machine;
    }

    /**
     * Méthode qui retourne une ip
     *
     * @return AdesseIp ip
     */
    public AdresseIP getIp()
    {
        return ip;
    }

    /**
     * Methode qui retourne un nom machine
     *
     * @return NomMachine machine
     */
    public NomMachine getMachine()
    {
        return machine;
    }
}
