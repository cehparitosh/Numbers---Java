import java.io.*;
class DuckNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n=br.readLine(); //inputting the number and storing it in a String
 
        int l=n.length(); //finding the length (number of digit) of the number
        int c=0; //variable for counting number of zero digits
        char ch;
 
        for(int i=1;i<l;i++)
        {
            ch=n.charAt(i); //extracting each digit and checking it is a '0' or not
            if(ch=='0')
                c++;
        }
         char f=n.charAt(0); //extracting the first digit 
         if(c>0 && f!='0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}