class WhileProgram9
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=10;
		int sum=0;
		while(a<=b)
		{
			if(a%2!=0)
			{
				sum=sum+a;
			}
			a++;
		}	
		System.out.println("sum of all element is "+sum);
	}
}