class SumOfDivisors
{
	public static void main(String [] args)
	{
		int num=12;
		int a=1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;

			}
			a++;
		}
		System.out.println("Sum of all divisors of "+num+" is "+sum);
	}
}