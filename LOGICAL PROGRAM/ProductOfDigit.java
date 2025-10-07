public class ProductOfDigit {
    static int productOfDigit(int n){
        int product=1;
        while(n!=0)
        {
            int rem=n%10;
            product=product*rem;
            n=n/10;
        }
        return product;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println("Product of digits of "+n+" is: "+productOfDigit(n));
    }
}
