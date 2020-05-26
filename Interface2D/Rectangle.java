/**
 * classe Rectangle
 *
 * @version (10/05/20)
 */
public class Rectangle extends Forme {

    private Position hautGauche;
    private Position basDroit;

    /**
     * Constructeur de la Rectangle
     *
     * @param hautGauche
     * @param basDroit
     * @param name
     */
    public Rectangle(Position hautGauche, Position basDroit, String name) {
        this.hautGauche = hautGauche;
        this.basDroit = basDroit;
        this.name = name;
    }

    /**
     * méthode deplacement permet de déplacer un rectangle
     *
     * @param x
     * @param y
     */
    public void deplacement(double x, double y) {
        this.hautGauche.deplacement(x, y);
        this.basDroit.deplacement(x, y);
    }

    /**
     * méthode getName permet d'afficher le nom d'un rectangle
     *
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * méthode toString permet d'afficher les informations d'un rectangle
     *
     * @return String information
     */
    public String toString() {
        return "Rectangle : { name : " + this.name + " }, { point haut gauche : " + this.hautGauche + " }, { point bas droit : " + this.basDroit + " }";
    }
}
