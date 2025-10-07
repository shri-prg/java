class Pattern10{
	public static void main(String [] args){
		int n=5; // size of square

		for(int i=0;i<n;i++)//no. of rows
		{
			for(int j=0;j<n;j++)//no. of colunms
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
				{
				System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
	
			System.out.println();
		}
	}
}