class Pattern8{
	public static void main(String [] args){
		int n=5; // size of square
		
		for(int i=0;i<n;i++)//no. of rows
		{
			
			for(int j=0;j<n;j++)//no. of colunms
			{
				if(i%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}

			}
		
			System.out.println();
		}
	}
}