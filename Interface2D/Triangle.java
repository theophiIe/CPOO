/**
 * classe Triangle
 *
 * @version (10/05/20)
 */
public class Triangle extends Forme {

    private Position sommet1;
    private Position sommet2;
    private Position sommet3;

    /**
     * Constructeur de la Triangle
     *
     * @param sommet1
     * @param sommet2
     * @param sommet3
     * @param name
     */
    public Triangle(Position sommet1, Position sommet2, Position sommet3, String name) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.name = name;
    }

    /**
     * méthode deplacement permet de déplacer un triangle
     *
     * @param x
     * @param y
     */
    public void deplacement(double x, double y) {
        this.sommet1.deplacement(x, y);
        this.sommet2.deplacement(x, y);
        this.sommet3.deplacement(x, y);
    }

    /**
     * méthode getName permet d'afficher le nom d'un triangle
     *
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * méthode toString permet d'afficher les informations d'un triangle
     *
     * @return String information
     */
    public String toString() {
        return "Triangle : { name : " + this.name + " }, { sommet1 : " + this.sommet1 + " }, { sommet2 : " + this.sommet2 + " }, { sommet3 : " + this.sommet3 + " }";
    }
}
