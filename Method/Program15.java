class Program15
{
	static void factorial(int num,int fact)
	{
		
		fact=fact*num;
		if(num>1)
		{
			num--;
			factorial(num,fact);

		}
		else
		{

			System.out.println(fact);
		}
	}
	public static void main(String [] args)
	{
		factorial(5,1);
	}
}