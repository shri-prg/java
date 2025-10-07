import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string : ");
      //  String str = sc.next();//it will read only one word
       // System.out.println("Enter the second string : ");
        String str1=sc.nextLine();//it will read multiple words.
     //   System.out.println(str);
        System.out.println(str1);
        sc.close();

    }
}
