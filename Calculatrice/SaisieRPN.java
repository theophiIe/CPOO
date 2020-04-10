import java.util.Scanner;

public class SaisieRPN
{
	private Scanner   sc;
	private MoteurRPN moteur;

	public SaisieRPN()
	{
		sc 	    = new Scanner(System.in);
		moteur  = new MoteurRPN();
	}

	public void saisie()
	{
		if( sc.hasNextDouble() )
		{
			double elem = sc.nextDouble();
			moteur.enregistrer(elem);
		}

		else
		{
			String signe = sc.nextLine();
			double nbre;

			switch(signe)
			{
				case("+") :
					nbre = moteur.calcul(Operation.PLUS);
					
					if (nbre == -1) 
						System.exit(0);

					System.out.println("resulatat : " + nbre);
					break;

				case("-") :
					nbre  = moteur.calcul(Operation.MOINS);

					if (nbre == -1) 
						System.exit(0);

					System.out.println("resulatat : " + nbre);
					break;

				case("*") :
					nbre  = moteur.calcul(Operation.MULT);

					if (nbre == -1) 
						System.exit(0);

					System.out.println("resulatat : " + nbre);
					break;

				case("/") :
					nbre  = moteur.calcul(Operation.DIV);

					if (nbre == -1) 
						System.exit(0);

					System.out.println("resulatat : " + nbre);
					break;

				case("exit") :
					System.exit(0);
			}
		}
	}
}