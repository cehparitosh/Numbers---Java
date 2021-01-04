import java.util.*;
class BouncyNumber
{
    boolean isIncreasing(int n) //Function to check whether a number is Increasing
    {
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch>s.charAt(i+1))// If any digit is more than next digit then we have to stop checking
            {
                f = 1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }
     
    boolean isDecreasing(int n) //Function to check whether a number is Decreasing
    {
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch<s.charAt(i+1))// If any digit is less than next digit then we have to stop checking
            {
                f = 1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }
     
    void isBouncy(int n)
    {
        if(isIncreasing(n)==true)
            System.out.println("The number " + n + " is Increasing and Not Bouncy");
        else if(isDecreasing(n)==true)
            System.out.println("The number " + n + " is Decreasing and Not Bouncy");
        else
            System.out.println("The number " + n + " is bouncy");
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BouncyNumber ob = new BouncyNumber();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.isBouncy(n);
    }
}