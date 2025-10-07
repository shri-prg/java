class Program14
{
	static int factorial(int num )
	{
		int fact=1;
		while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		System.out.println(i+ " factorial of : "+factorial(i));
	}
}