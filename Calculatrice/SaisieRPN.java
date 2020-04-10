import java.util.Scanner;

/**
 * classe SaisieRPN
 *
 * @version (11/04/2020)
 */
public class SaisieRPN
{
	private Scanner   sc;
	private MoteurRPN moteur;

	/**
     * Constructeur d'objets de classe SaisieRPN
     */
	public SaisieRPN()
	{
		sc 	    = new Scanner(System.in);
		moteur  = new MoteurRPN();
	}

	/**
     * methode saisie recupere les saisies claviers
     */
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