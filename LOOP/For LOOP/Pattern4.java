class Pattern4{
	public static void main(String [] args){
		int n=5; // size of square
		int val=5;
		for(int i=0;i<n;i++)//no. of rows
		{
			for(int j=0;j<n;j++)//no. of colunms
			{
				System.out.print(val+" ");
			}
			val--;
			System.out.println();
		}
	}
}