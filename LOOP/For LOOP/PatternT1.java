class PatternT1
{
	public static void main(String [] args)
	{
		int n=3;
		
		for(int i=0;i<n;i++)
		{
			int val=3;
			for(int j=0;j<n;j++)
			{
				System.out.print(val);
				val--;
			}
			System.out.println();
		}
	}	
}