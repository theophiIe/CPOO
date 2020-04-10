/**
 * class MoteurRPN
 *
 * @version (14/02/2020)
 */
public class MoteurRPN
{
	private Pile pile;

  	/**
     * Constructeur d'objets de classe MoteurRPN
     */
	public MoteurRPN()
	{
		pile = new Pile();
	}
	
	/**
     * methode enregistrer : push la pile
     *
     * @param elem double
     */
	public void enregistrer(double elem)
	{
		pile.myPush(elem);
	}

	/**
     * methode calcul : si plus de deux arg dans la pile lance le calcule
     *
     * @return double
     * @param operation Operation
     */
	public double calcul(Operation operation)
	{
		if(pile.recupTaille() < 2)
		{
			System.out.println("Pas assez d'argument");

			return (double)-1;
		}

		else
		{
			Double nombre1 = pile.myPop();
			Double nombre2 = pile.myPop();

			pile.myPush(operation.eval(nombre1, nombre2));

			return pile.myPeek();

		}
	}
}