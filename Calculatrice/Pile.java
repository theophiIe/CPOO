import java.util.*;

/**
 * classe SaisieRPN
 *
 * @version (11/04/2020)
 */
public class Pile
{
	private int taille;
	private Stack<Double> pile;
	
	/**
     * Constructeur d'objets de classe Pile
     */
	public Pile()
	{
		this.pile 	   = new Stack<Double>();
		this.taille    = 0;
	}

	/**
     * méthode recupPile : recupère la pile
     *
     * @return Stack<Double>
     */
	public Stack<Double> recupPile()
	{
		return pile;
	}

	/**
     * méthode recupTaille : taille de la pile
     *
     * @return int
     */
	public int recupTaille()
	{
		return taille;
	}

	/**
     * méthode myPush : push la pile
     *
     * @return int 
     * @param elem Double
     */
	public int myPush(Double elem)
	{
		pile.push(elem);
		taille = taille + 1;
		return taille;
	}

	/**
     * méthode myPop : pop la pile
     *
     * @return Double 
     */
	public Double myPop() throws EmptyStackException
	{
		try
		{
			taille = taille - 1;
			return pile.pop();
		}

		catch(EmptyStackException except)
		{
			System.out.println("La pile est vide");
			return (double)-1;
		}
	}

	/**
     * méthode myPeek : peek la pile
     *
     * @return Double 
     */
	public Double myPeek() throws EmptyStackException
	{
		try
		{
			return pile.peek();
		}

		catch(EmptyStackException except)
		{
			System.out.println("La pile est vide");
			return (double)-1;
		}
	}
}
