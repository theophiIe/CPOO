import java.util.*;

public class Pile
{
	private int tailleMAX;
	private int taille;
	private Stack<Double> pile;
	

	public Pile()
	{
		this.tailleMAX = 50;
		this.pile 	   = new Stack<Double>();
		this.taille    = 0;
	}

	public Stack<Double> recupPile()
	{
		return pile;
	}

	public int recupTaille()
	{
		return taille;
	}

	public int myPush(Double elem)
	{
		if(taille < tailleMAX)
		{
			pile.push(elem);
			taille = taille + 1;
			return taille;
		}

		else
		{
			System.out.println("Taille maximum de la pile atteinte");
			return -1;
		}
	}

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
