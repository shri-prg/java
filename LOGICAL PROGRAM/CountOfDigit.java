public class CountOfDigit {
    static int countOfDigit(int n){
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println("Count of digits of "+n+" is: "+countOfDigit(n));
    }
}
