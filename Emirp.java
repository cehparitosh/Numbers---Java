import java.util.*;
class Emirp
{ 
    int n, rev,f;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x)
    {
        if(n==x)
        return 1;
        else if (n%x==0 || n==1)
        return 0;
        else
        return isprime(x+1);
    }
    void isEmirp()
    {
        int x=n;
        while(x!=0)
     {
         rev=rev*10 + x%10;
         x=x/10;
         
        }
        int ans1=isprime(f);
        n=rev;
        f=2;
        int ans2=isprime(f);
        if(ans1==1 && ans2==1)
        System.out.println(n+"is an emirp no");
        else
        System.out.println(n+"is not an emirp no.");
        
    }
    public static void main(String[] args) 
    { 
      int a; 
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      a=sc.nextInt();
        Emirp emp=new Emirp(a);
        emp.isEmirp();

    } 
}