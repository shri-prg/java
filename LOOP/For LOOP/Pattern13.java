class Pattern13{
	public static void main(String [] args){
		int n=5; // size of square
		int mid=n/2;
		for(int i=0;i<n;i++)//no. of rows
		{
			for(int j=0;j<n;j++)//no. of colunms
			{
				if(i==0||j==0||j==n-1||i==n-1||i==mid||j==mid)
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