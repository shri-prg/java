public class Program11 {
    public static void main(String[] args) {
        int [] arr={13,11,12,14,18,17};
        int sum=0;
		for(int i=0;i<arr.length;i++)
		{
            if (arr[i]%2!=0) 
            {
            
               sum=sum+arr[i];
            }
			
		}
        System.out.println("sum of odd : "+sum);
    }
}
