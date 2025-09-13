public class Example6 {
    public static void main(String[] args) {
        System.out.println("Post operation");
        int p=7;
        int q=p++ + p++;
        System.out.println(q);
        int r=5;
        int s= r-- + r--;
        System.out.println(s);
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
        int m= 12;
        System.out.println(++m);
        System.out.println(++m);
        System.out.println(m);
        int j = 16;
        System.out.println(--j);
        System.out.println(--j);
        System.out.println(j);
        int g = 11; 
        int k = ++g + ++g;
        System.out.println(k);
        int o = 18;
        int l = --o + --o;
        System.out.println(l);
        int f= 14;
        int e = ++f + ++f + ++f;
        System.out.println(e);
        int w =13;
        int u=--w + --w + --w;
        System.out.println(u);
        int h= 13;
        int v= 16;
        int n= --h + ++v + --h + ++v;
        System.out.println(n);
    }
}
