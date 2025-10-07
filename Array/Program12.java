public class Program12 {
    	public static void main(String [] args)
	    {
		    int [] arr1={10,14,13,17,16};
            int sum=0;
		    for(int i=0;i<arr1.length;i++)
		    {
		    	sum=sum+arr1[i];
		    }
            int avg=sum/arr1.length;
            System.out.println("Avarage of array : "+avg);
	    }
}

