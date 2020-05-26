import java.io.IOException;

/**
 * classe DnsApp
 *
 * @version (25/04/20)
 */
public class DnsApp
{
    /**
     * Methode main
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        System.out.println("Exercice 8.6.1 DNS :");

        DnsTUI tui = new DnsTUI();
        while(true)
            tui.affichage();
    }
}
