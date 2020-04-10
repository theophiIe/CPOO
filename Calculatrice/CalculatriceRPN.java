public class CalculatriceRPN 
{
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