class Program16
{
	static void primeNumber(int n)
	{   
		if(n<=100)
		{
			int count=0;
			int a=2;
			while(a<=n/2)
			{
				if(n%a==0)
				{
					count++;
				}
				a++;
			}
			if(count ==0)
			{
				System.out.println(n+" is the prime number");
			}
			n++;
			primeNumber(n);
		}
	}
	public static void main(String [] args)
	{
		primeNumber(2);
	}
}