public class PrimeAdvance 
{
    public static void main(String[] args) {
        int n=5;
        boolean res=isPrime(n);
        if(res==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }    
    static boolean isPrime(int n)
    {
        for(int i =2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }


        }
        return true;
    }

}
