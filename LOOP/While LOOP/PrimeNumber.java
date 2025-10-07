class PrimeNumber
{
	public static void main(String [] args)
	{
		int num=29;
		int a=2; // in this code the number of itration is less as compare to any other way of prime number code
		int count=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;

			}
			a++;
		}
		if(count==0)
		{
			System.out.println(num +" is the Prime Number");
		}
		else
		{
			System.out.println(num+" is not Prime Number");
		}
	}
}