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
			System.out.println(val1 + " / " + val2);
			return val1 / val2;
		}
	};

	private	char symbole;

	Operation(char symbole)
	{
		this.symbole = symbole;
	}

	public abstract double eval(double val1, double val2);
}