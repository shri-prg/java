import java.util.Scanner;
public class Factorial {
    static void factorialNum(int num,int fact )
    {
        while(num>1)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        factorialNum(num,1);
    }
}
