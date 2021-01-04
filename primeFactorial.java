import java.util.*;
public class primeFactorial
{    
    int i,m,flag,n;  
    primeFactorial()
    {
        n=0;
        m=0;
        flag=0;
    }
    public  void input()
    {    
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
    }
    public void calculate()
    {
       input();        // input()method invocation
        m=n/2;      
        if(n==0||n==1)
        {  
            System.out.println(n+" is not prime number");      
           
        }
        else
        {  
            for(i=2;i<=m;i++)
            {      
                if(n%i==0)
                {          
                    flag=1;      //status variable, if any divisor found, flag=1
                    break;      
                }      
            } // end of for loop
            if(flag==0) 
            { 
                System.out.println(n+" is prime number"); 
                fact(n);
                
            }
            else    
            {
                System.out.println(n+" is not prime number");
            }
        }//end of outer else  
    }
   public void fact(int num1)
   {
       int n2=num1,fact=1;
       for(int j=1;j<=n2;j++)
       fact=fact *j;
       System.out.println("Factorial " +   fact);
    }
    
 public static void main(String args[])
 {    
     primeFactorial pN=new primeFactorial();
     pN.calculate();   // calculate() method call
  
    }
}