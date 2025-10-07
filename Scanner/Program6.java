import java.util.Scanner;
public class Program6 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the character : ");
    char ch = sc.next().charAt(0); // here we take the any string also then also it will return 1 character
    System.out.println("Character : "+ch);
  }  
}
