import java.util.Scanner;
public class CheckNumber{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else
        {
            System.out.println(num+" is odd number");
        }
        sc.close();
    }
}