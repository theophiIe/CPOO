/**
 * classe Forme
 *
 * @version (10/05/20)
 */
abstract class Forme {

    protected String name;

    /**
     * méthode deplacement permet de déplacer une forme
     *
     * @param x
     * @param y
     */
    public abstract void deplacement(double x, double y);

    /**
     * méthode getName permet d'afficher le nom d'une forme
     *
     * @return name
     */
    public abstract String getName();

    /**
     * méthode toString permet d'afficher les informations d'une forme
     *
     * @return information
     */
    @Override
    public abstract String toString();
}
