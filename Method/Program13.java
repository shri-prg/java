class Program13
{
	static int square(int num )
	{
		int sq=num*num;
		return sq;
	}
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		System.out.println(i+ " square : "+square(i));
	}
}