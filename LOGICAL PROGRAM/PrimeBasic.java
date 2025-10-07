class PrimeBasic {
public static void main(String[] args) {
    int n=5;
    boolean res= isPrime(n);
    if(res==true){
        System.out.println("Prime");
    }
    else
    {
        System.out.println("Not prime");
    }
}
static boolean isPrime(int n)
{
    int count=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        count++;
    }
    if(count==2)
    {
        return true;

    }
    else
    {
        return false;
    }
}
}