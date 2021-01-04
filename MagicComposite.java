import java.io.*;
class MagicComposite
{  
    boolean isComposite(int n) // Function to check for Composite number
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count>2)
            return true;
        else
            return false;
    }
 
    int sumDig(int n) // Function to return sum of digits of a number
    {
        int s = 0;
        while(n>0)
        {
            s = s + n%10;
            n = n/10;
        }
        return s;
    }
     
    boolean isMagic(int n) // Function to check for Magic number
    {
        int a = sumDig(n);
        while(a>9)
        {
            a = sumDig(a);
        }
                     
        if(a == 1)
            return true;
        else
            return false;
    }
 
    public static void main(String args[])throws IOException
    {
        MagicComposite mc = new MagicComposite();
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         
        System.out.print("Enter the lower limit(m) : ");
        int m=Integer.parseInt(br.readLine());
        System.out.print("Enter the upper limit(n) : ");
        int n=Integer.parseInt(br.readLine());
         
        int c=0;
        if (m<n)
        {
            System.out.println("The Composite Magic Integers are: ");
            for(int i=m; i<=n; i++)
            {
                if(mc.isComposite(i)==true && mc.isMagic(i)==true)
                {
                    if (c==0) // Printing the first number without any comma
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                    c++;
                }
            }
            System.out.println("\nThe frequency of Composite Magic Integers is : "+c);
        }
         else
            System.out.println("INVALID RANGE");
    }
}