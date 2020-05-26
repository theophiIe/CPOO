import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * classe Affichage
 *
 * @version (10/05/20)
 */
public class Affichage {

    private Scanner scanner;
    private ArrayList<Forme> liste;

    /**
     * Constructeur de la classe Affichage
     */
    public Affichage() {
        this.liste = new ArrayList<Forme>();
    }

    /**
     * Méthode commandeTerminal permet de récuperer les informations inscrite dans le terminal
     *
     * @return String sc
     * @throws NoSuchElementException
     */
    private String commandeTerminal() throws NoSuchElementException {
        scanner = new Scanner( System.in );
        System.out.print( "> " );

        try {
            String sc = scanner.nextLine();
            return sc;
        }

        catch (NoSuchElementException except) {
            System.out.println("Erreur lors de la saisie du nom");
            String sc = "";
            return sc;
        }
    }

    /**
     * Méthode infoTerminal permet de récuper un double taper dans le terminal
     *
     * @return double coordonne
     * @throws InputMismatchException
     */
    private double infoTerminal() throws InputMismatchException {
        scanner = new Scanner( System.in );
        System.out.print("> ");

        try {
            double coordonne = scanner.nextDouble();
            return coordonne;
        }

        catch (InputMismatchException except) {
            System.out.println("Erreur : Veuillez réessayer");
            double sc = infoTerminal();
            return sc;
        }
    }

    /**
     * Méthode afficheCercle permet de creer un cercle et de l'ajouter à la liste des formes
     */
    private void afficheCercle() {
        System.out.println("Veuillez chosir un nom à la firgure :");
        String nameCercle = commandeTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le centre :");
        double centreX = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le centre :");
        double centreY = infoTerminal();

        System.out.println("Veuillez entrer la taille du rayon :");
        double rayon = infoTerminal();

        Position pos = new Position(centreX, centreY);

        Forme cercle = new Cercle(pos, rayon, nameCercle);

        System.out.println(cercle.toString());

        this.liste.add(cercle);
    }

    /**
     * Méthode afficheRectangle permet de creer un rectangle et de l'ajouter à la liste des formes
     */
    private void afficheRectangle() {
        System.out.println("Veuillez chosir un nom à la firgure :");
        String nameRectangle = commandeTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le hautGauche :");
        double hautGaucheX = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le hautGauche :");
        double hautGaucheY = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le basDroit :");
        double basDroitX = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le basDroit :");
        double basDroitY = infoTerminal();

        Position posHautGauche = new Position(hautGaucheX, hautGaucheY);
        Position posBasDroit   = new Position(basDroitX, basDroitY);

        Forme rectangle = new Rectangle(posHautGauche, posBasDroit, nameRectangle);

        System.out.println(rectangle.toString());

        this.liste.add(rectangle);
    }

    /**
     * Méthode afficheTriangle permet de creer un triangle et de l'ajouter à la liste des formes
     */
    private void afficheTriangle() {
        System.out.println("Veuillez chosir un nom à la firgure :");
        String nameTriangle = commandeTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le sommet1 :");
        double sommet1X = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le sommet1 :");
        double sommet1Y = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le sommet2 :");
        double sommet2X = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le sommet2 :");
        double sommet2Y = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées x pour le sommet3 :");
        double sommet3X = infoTerminal();

        System.out.println("Veuillez entrer les coordonnées y pour le sommet3 :");
        double sommet3Y = infoTerminal();

        Position sommet1 = new Position(sommet1X, sommet1Y);
        Position sommet2 = new Position(sommet2X, sommet2Y);
        Position sommet3 = new Position(sommet3X, sommet3Y);

        Forme triangle = new Triangle(sommet1, sommet2, sommet3, nameTriangle);

        System.out.println(triangle.toString());

        this.liste.add(triangle);
    }

    /**
     * Méthode gestionDessin permet de choisir la forme à créer entre un cercle, un rectangle et un triangle
     */
    private void gestionDessin() {
        System.out.println("Veuillez chosir une forme : (cercle, rectangle, triangle)");
        String forme = commandeTerminal();

        if(forme.equals("cercle")) {
            afficheCercle();
        }

        else if(forme.equals("rectangle")) {
            afficheRectangle();
        }

        else if(forme.equals("triangle")) {
            afficheTriangle();
        }

        else{ System.out.println("Figure inconnue"); }
    }

    /**
     * Méthode move permet de déplacer une forme ou un groupe de forme
     */
    private void move() {
        System.out.println("Veuillez choisir les formes à déplacer :");
        String forme = commandeTerminal();

        String[] tabForme = forme.split(" ");

        System.out.println("De combien voulez-vous déplacer en x?");
        double deplaceX = infoTerminal();

        System.out.println("De combien voulez-vous déplacer en y?");
        double deplaceY = infoTerminal();

        int vu = 0;

        for(String nomForme : tabForme) {
            for(Forme fig : this.liste) {
                if(nomForme.equals(fig.getName())) {
                    fig.deplacement(deplaceX, deplaceY);
                    System.out.println(fig.toString());
                    vu = 1;
                }
            }

            if(vu == 0) {
                System.out.println("La forme : " + nomForme + " n'existe pas");
            }

            vu = 0;
        }

    }

    /**
     * Méthode show permet d'afficher la liste des formes créées
     */
    private void show() {

        if(this.liste.isEmpty()) {
            System.out.println("Aucune forme a été crée");
        }

        else{
            System.out.println("La liste des Formes :");
            for(Forme forme: this.liste)
            {
                System.out.println (forme);
            }
        }
    }

    /**
     * Méthode affichage permet d'utiliser les différentes méthodes de la classe
     * suivant l'instruction inscrite dans le terminal
     */
    public void affichage() {
        System.out.println("\nQue voulez vous faire : (Dessin, Deplacer, Afficher, Quitter)");
        String cmd = commandeTerminal();

        if(cmd.equals("Dessin")) {
            gestionDessin();
        }

        else if(cmd.equals("Deplacer")) {
            move();
        }

        else if(cmd.equals("Afficher")) {
            show();
        }

        else if(cmd.equals("Quitter")) {
            System.out.println("Fin du programme");
            System.exit(0);
        }

        else{System.out.println("Commande inconnue");}

    }
}
