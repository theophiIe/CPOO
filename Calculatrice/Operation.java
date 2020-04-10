/**
 * enum Operation
 *
 * @version (14/02/2020)
 */
public enum Operation
{
	PLUS('+')
	{
		public double eval(double val1, double val2)
		{
			System.out.println(val1 + " + " + val2);
			return val1 + val2;
		}
	},

	MOINS('-')
	{
		public double eval(double val1, double val2)
		{
			System.out.println(val2 + " - " + val1);
			return val2 - val1;
		}
	},

	MULT('*')
	{
		public double eval(double val1, double val2)
		{
			System.out.println(val1 + " * " + val2);
			return val1 * val2;
		}
	},

	DIV('/')
	{
		public double eval(double val1, double val2)
		{
			if(val2 == 0)
			{
				System.out.println("Erreur on ne divise pas par zéro");
				System.exit(0);
			}

			System.out.println(val1 + " / " + val2);
			return val1 / val2;
		}
	};

	private	char symbole;

	/**
     * Constructeur d'objets de classe Operation
     * 
     * @param symbole char
     */
	Operation(char symbole)
	{
		this.symbole = symbole;
	}

	/**
     * methode abstract eval
     *
     * @return double 
     * @param val1 double
     * @param val2 double
     */
	public abstract double eval(double val1, double val2);
}