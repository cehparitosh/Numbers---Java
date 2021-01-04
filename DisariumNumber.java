import java.util.*;
class DisariumNumber
    {
         int n,rem, sum,len;
           DisariumNumber()
           {
            n =0;
            rem = 0;
            sum = 0;
            
            }
            void read()
            {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            }
    
            void cal()
            {
                read();
            int copy = n; 
            String s = Integer.toString(n); //converting the number into a String
            len = s.length(); //finding the length of the number 
             
            while(copy>0)
            {
                rem = copy % 10; //extracting the last digit
                sum = sum + (int)Math.pow(rem,len);
                len--;
                copy = copy / 10;
            }
              if(sum == n)
                System.out.println(n+" is a Disarium Number.");
            else
                System.out.println(n+" is not a Disarium Number.");
        }
        public static void main(String[] args){
            DisariumNumber ds= new DisariumNumber();
            ds.cal();
          
        }
    }