class WhileProgram10
{
	public static void main(String[] args) 
	{
		int n=7;
		int fact=1;
		while(n>=1)
		{
			fact=fact*n;
			n--;
		}	
		System.out.println("factorial of number is "+fact);
	}
}