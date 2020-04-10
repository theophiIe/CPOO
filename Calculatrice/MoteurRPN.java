public class MoteurRPN
{
	private Pile pile;

	public MoteurRPN()
	{
		pile = new Pile();
	}

	public void enregistrer(double elem)
	{
		pile.myPush(elem);
	}

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