import java.util.*;
class TwinPrimeRange
{        
     boolean isPrime(int n) //funton for checking prime
        {
            int count=0;
            for(int i=1; i<=n; i++)
                {
                    if(n%i == 0)
                        count++;
                }
            if(count == 2)
                return true;
             else
                return false;
        }
  
    public static void main(String args[])
        {
            TwinPrimeRange ob = new TwinPrimeRange();
            Scanner sc = new Scanner(System.in);
             
            System.out.print("Enter the lower range : ");
            int p = sc.nextInt();
            System.out.print("Enter the upper range : ");
            int q = sc.nextInt();
             
            if(p>q)
                System.out.println("Invalid Range !");
            else
            {
                System.out.println("\nThe Twin Prime Numbers are : ");
                for(int i=p; i<=(q-2); i++)
                {
                    if(ob.isPrime(i) == true && ob.isPrime(i+2) == true)
                    {
                        System.out.print("("+i+","+(i+2)+") ");
                    }
                }
            }                 
        }
}