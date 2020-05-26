//Utilisation de HashMap
import java.util.*;

//Lecture du fichier
import java.io.BufferedReader;
import java.io.FileReader;

//Gestion des erreurs
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * classe Dns
 *
 * @version (25/04/20)
 */
public class Dns
{
    private HashMap<AdresseIP, NomMachine> ipToMachine;
    private HashMap<NomMachine, AdresseIP> machineToIp;
    private String nameFile = null;

    /**
     * Constructeur de la classe Dns
     *
     * @param nameFile
     */
    public Dns(String nameFile)
    {
        this.ipToMachine = new HashMap<AdresseIP, NomMachine>();
        this.machineToIp = new HashMap<NomMachine, AdresseIP>();

        this.nameFile = nameFile;
    }

    /**
     * La méthode Lecture fichier permet de lire un fichier de configuration
     * et de remplir les hashmaps
     *
     * @throws IOException
     */
    public void LectureFichier() throws IOException
    {
        BufferedReader lecture = null;
        String ligne;

        try
        {
            lecture = new BufferedReader(new FileReader(this.nameFile));

            while((ligne = lecture.readLine()) != null)
            {
                int cmpt = 0;
                while(!Character.isWhitespace(ligne.charAt(cmpt)))
                {
                    cmpt++;
                }

                AdresseIP  ip      = new AdresseIP(ligne.substring(0, cmpt));
                NomMachine machine = new NomMachine(ligne.substring(cmpt+1, ligne.length()));
                DnsItem    item    = new DnsItem(ip, machine);

                DnsAdd(item);
            }

            lecture.close();
        }

        catch(FileNotFoundException exception)
        {
            System.out.println("Erreur lors de l'ouverture du fichier de configuration\n");
            System.exit(1);
        }
    }

    /**
     * La méthode DnsAdd de remplir les hasmaps
     *
     * @param item
     */
    public void DnsAdd(DnsItem item)
    {
        this.ipToMachine.put(item.getIp(), item.getMachine());
        this.machineToIp.put(item.getMachine(), item.getIp());
    }

    /**
     * La méthode getItem vérifie que l'ip mise en parametre
     * est un clé de la hasmap
     *
     * @param ip
     * @return DnsItem
     */
    public DnsItem getItem( AdresseIP ip )
    {
        for( Map.Entry <AdresseIP , NomMachine> element : this.ipToMachine.entrySet() )
        {
            if( element.getKey().toString().equals( ip.toString() ) )
                return new DnsItem (ip, element.getValue());

        }

        //Si l'ip n'est pas trouvé return inconnu
        NomMachine name = new NomMachine("Inconnu");
        return new DnsItem (ip, name);
    }

    /**
     * La methode getItem vérifie que la machine mise en parametre
     * est une clé de la hasmap
     *
     * @param machine
     * @return DnsItem
     */
    public DnsItem getItem( NomMachine machine )
    {
        for( Map.Entry < NomMachine, AdresseIP > element : this.machineToIp.entrySet() )
        {
            if( element.getKey().toString().equals( machine.toString() ) )
                return new DnsItem (element.getValue(), machine);
        }

        //Si le nom machine n'est pas trouvé return inconnu
        AdresseIP ip = new AdresseIP("Inconnu");
        return new DnsItem (ip, machine);
    }

    /**
     * La méthode decoupe va découper le nom machine
     * pour recuperer le domaine
     *
     * @param machine
     * @return String machine
     */
    private String decoupe(String machine)
    {
        int cmpt = 0;

        machine = machine.replace("."," ");

        while(!Character.isWhitespace(machine.charAt(cmpt)))
        {
            cmpt++;
        }

        machine = machine.substring(cmpt + 1, machine.length());
        machine = machine.replace(" ",".");

        return machine;
    }

    /**
     * Cette méthode permet d'optenir une liste des noms machines
     * composé du nom de domaine mise en parametre
     *
     * @param domaine
     * @return ArrayList listDomaine
     */
    public ArrayList getItem(String domaine)
    {
        ArrayList listDomaine = new ArrayList();

        for( Map.Entry < NomMachine, AdresseIP > element : this.machineToIp.entrySet() )
        {
            if( decoupe(element.getKey().toString()).equals( domaine ) )
            {
                listDomaine.add(element.getValue());
                listDomaine.add(element.getKey());
            }
        }

        return listDomaine;
    }
}
