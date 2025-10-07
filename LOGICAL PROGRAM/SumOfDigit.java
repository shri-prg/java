public class SumOfDigit {
    static int sumofDigit(int n){
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println("Sum of digits of "+n+" is: "+sumofDigit(n));
    }
    
}