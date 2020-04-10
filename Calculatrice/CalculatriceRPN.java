/**
 * classe CalculatriceRPN
 *
 * @version (11/04/2020)
 */
public class CalculatriceRPN 
{
	/**
     * Constructeur d'objets de classe CalculatriceRPN
     */
	public static void main(String[] args)
	{
		SaisieRPN expression = new SaisieRPN();
		System.out.println("Entrer votre expression : ");

		while(true)
		{
			expression.saisie(); 
		}
	}
}