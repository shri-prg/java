import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = sc.nextInt();
        System.out.println("Enter height : ");
        double height= sc.nextDouble();
        System.out.println("are you married : true/false");
        boolean married=sc.nextBoolean();
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
        System.out.println("Married : "+married);
    }
}
