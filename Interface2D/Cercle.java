/**
 * classe Cercle
 *
 * @version (10/05/20)
 */
public class Cercle extends Forme {

    private Position centre;
    private double rayon;

    /**
     * Constructeur de la Cercle
     *
     * @param centre
     * @param name
     * @param rayon
     */
    public Cercle(Position centre, double rayon, String name) {
        this.centre = centre;
        this.rayon = rayon;
        this.name = name;
    }

    /**
     * méthode deplacement permet de déplacer un cercle
     *
     * @param x
     * @param y
     */
    public void deplacement(double x, double y) {
        this.centre.deplacement(x, y);
    }

    /**
     * méthode getName permet d'afficher le nom d'un cercle
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * méthode toString permet d'afficher les informations d'un cercle
     *
     * @return information
     */
    public String toString() {
        return "Cercle : { name : " + this.name + " }, { centre : " + this.centre + " }, { rayon : " + this.rayon + " }";
    }
}
