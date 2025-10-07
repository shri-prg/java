import java.util.Scanner;
public class PrimeNumber {
    static void prime(int n)
    {
        int count = 1;
        int a=1;
        while(a<=n/2)
        {
            if(n%a==0)
            {
                count++;
            }
            a++;
        }
        if(count==2)
        {
            System.out.println(n+ " is prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        prime(n);
    }
}
