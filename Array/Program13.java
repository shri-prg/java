public class Program13{
    public static void main(String[] args) {
        double [] dArr={7.4,9.3,2.7,4.5,8.5,3.4};
        double sum = 0.0;
        for(int i=0;i<dArr.length;i++)
        {
            sum=sum+dArr[i];
        }
        double avg = sum/dArr.length;
        System.out.println(avg);
    }
}
