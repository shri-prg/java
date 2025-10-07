import java.util.Scanner;
public class Program1 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number: ");
        int val = sc.nextInt();
        System.out.println("Value : "+val);
        sc.close();
    }
}