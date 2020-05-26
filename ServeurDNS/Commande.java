import java.util.ArrayList;

/**
 * Interface Commande
 *
 * @version (25/04/20)
 */
public interface Commande
{
    void execute(String cmd);
    void execute(ArrayList list);
}
