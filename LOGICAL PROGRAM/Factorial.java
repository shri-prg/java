class Factorial
{
    static int factN(int n)
    {
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
       
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is: "+factN(n));
    }
}