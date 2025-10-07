class Program6
{
	static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	static void subtraction(int a,int b)
	{
		int sub = a-b;
		System.out.println(a+" - "+b+" = "+sub );
	}
	public static void main(String [] args)
	{
		addition(8,9);		
		addition(81,9);		
		addition(84,91);		
		addition(86,19);		
		subtraction(10,5);
		subtraction(10,15);
		subtraction(100,15);


	}
}