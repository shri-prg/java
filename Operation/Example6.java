public class Example6 {
    public static void main(String[] args) {
        System.out.println("Post operation");
        int p=7;
        int q=p++ + p++;
        System.out.println(q);
        int r=5;
        int s= q-- + q--;
        System.out.println(q);
        int a=10;
        int b= a++ + a++ + a++;
        System.out.println(b);
        int x = 12;
        int y= 15;
        int z= x-- + y++ + x-- + y++;
        System.out.println(z);
        System.out.println("Pre operations ");
        int i= 5;

        System.out.println(++i);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}
