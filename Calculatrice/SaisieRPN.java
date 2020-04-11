import java.util.Scanner;
import java.lang.Math;
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
			double MAX_VALUE = 1.79769313486231570e+308d;
			double MIN_VALUE = 4.94065645841246544e-324d;
			double elem      = sc.nextDouble();
			
			if(MAX_VALUE > Math.abs(elem) && MIN_VALUE < Math.abs(elem))
				moteur.enregistrer(elem);

			else
			{
				System.out.println("la valeur : " + elem + " n'est pas reconnue par la calculatrice");
			}
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