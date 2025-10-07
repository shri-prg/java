public class Program14 {
    public static void main(String[] args) {
        int [] arr = {10,14,13,17,16};
        int large = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("Large : "+large);
    }
}
