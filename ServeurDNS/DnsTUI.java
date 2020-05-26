import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Regex
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interface Commande
 *
 * @version (25/04/20)
 */
public class DnsTUI implements Commande
{
    Scanner scanner;

    private Pattern patternIp;
    private Pattern patternDomaine;
    private Matcher matcher;

    // Regex pour l'IPV4
    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    // Regex pour le nom machine
    private static final String NOM_DOMAINE_PATTERN = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)" +
                                                      "([A-Za-z0-9-]{1,63}(?<!-)\\.)" +
                                                      "[A-Za-z]{2,6}$";

    /**
     * Constructeur de la classe DnsTUI
     */
    public DnsTUI()
    {
        scanner = new Scanner( System.in );
        patternIp = Pattern.compile(IPADDRESS_PATTERN);
        patternDomaine = Pattern.compile(NOM_DOMAINE_PATTERN);
    }

    /**
     * Méthode permettant de vérifier si une ip
     * est correctement écrite
     *
     * @param ip
     * @return boolean
     */
    private boolean ifIp(final String ip)
    {
        matcher = patternIp.matcher(ip);
        return matcher.matches();
    }

    /**
     * Méthode permettant de vérifier si un nom machine
     * est correctement écris
     *
     * @param domaine
     * @return boolean
     */
    private boolean ifDomaine(final String domaine)
    {
        matcher = patternDomaine.matcher(domaine);
        return matcher.matches();
    }

    /**
     * Cette méthode affiche le résultat correspondant
     * à la commande tapé dans le terminal
     *
     * @param cmd
     */
    public void execute(String cmd)
    {
        System.out.println(cmd);
    }

    /**
     * La méthode affiche le nom machine puis
     * l'adresse ip apres une commande ls -a
     *
     *
     * @param list
     */
    public void execute(ArrayList list)
    {
        int cmpt = 0;
        while(cmpt < list.size())
        {
            System.out.println(list.get(cmpt+1) + "\t" + list.get(cmpt));
            cmpt+=2;
        }

    }

    /**
     * Methode permettant de recuper
     * la commande ecrite dans le terminal
     *
     * @return String sc
     */
    public String commandeTerminal()
    {
        System.out.print( "> " );
        String sc = scanner.nextLine();

        return sc;
    }

    /**
     * Méthode d'identifier les commandes
     * inscrites dans le terminal
     *
     * @throws IOException
     */
    public void affichage() throws IOException
    {
        String cmd = commandeTerminal();

        Dns dns = new Dns("data.txt");
        dns.LectureFichier();

        if( ifIp(cmd) )
        {
            AdresseIP ip = new AdresseIP(cmd);
            DnsItem item = dns.getItem(ip);

            String adresse = item.getMachine().toString();
            execute(adresse);

        }

        else if(cmd.equals("exit"))
        {
            execute(cmd);
            System.exit(0);
        }

        else if ( ifDomaine(cmd) )
        {
            NomMachine nm = new NomMachine(cmd);
            DnsItem item = dns.getItem(nm);

            String ip = item.getIp().toString();
            execute(ip);
        }

        else if(cmd.contains("ls -a"))
        {
            ArrayList listDomaine = dns.getItem(cmd.substring(6,cmd.length()));

            if(listDomaine.size() != 0)
            {
                execute(listDomaine);
            }

            else
            {
                execute("Aucun élément trouvé");
            }
        }

        else if(cmd.contains("ls"))
        {
            ArrayList listDomaine = dns.getItem(cmd.substring(3,cmd.length()));

            int cmpt = 1;

            if(listDomaine.size() != 0)
            {
                while (cmpt < listDomaine.size()) {
                    execute(listDomaine.get(cmpt).toString());
                    cmpt += 2;
                }
            }

            else
                {
                    execute("Aucun élément trouvé");
                }
        }

        else { execute("Erreur de syntaxe"); }

    }

}
