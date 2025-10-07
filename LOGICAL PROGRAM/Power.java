public class Power {
    static int powerN(int n, int p)
    {
        int power=1;
        for(int i=1;i<=p;i++)
        {
            power=power*n;
        }
        return power;
    }
    public static void main(String[] args) {
        int n=2;
        int p=3;
        System.out.println(n+" raised to the power "+p+" is: "+powerN(n,p));
    }
}
