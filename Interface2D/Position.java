/**
 * classe Position
 *
 * @version (10/05/20)
 */
public class Position extends Forme{

    private double x;
    private double y;

    /**
     * constructeur de la classe Position
     *
     * @param x
     * @param y
     */
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * méthode deplacement permet de déplacer une forme
     *
     * @param dx
     * @param dy
     */
    public void deplacement(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * méthode getName permet d'afficher le nom d'une forme
     *
     */
    public String getName() {
        return "inconnue";
    }

    /**
     * méthode toString permet d'afficher les informations sur la position d'un point d'une forme
     *
     * @return String avec la position d'un point d'une forme
     */
    public String toString()
    {
        return "x : " + x + ", y : " + y;
    }

}
