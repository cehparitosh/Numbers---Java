import java.util.Scanner;
class Evil
{
    int n, a, count1=0;
    String s = "";
    void input()
     {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter decimal number ");
     n = sc.nextInt();
     System.out.println("INPUT : "+n);
     }
void calculate()
{
    input();
    while(n>0)
{
a = n%2;
if(a == 1)
{
count1++;
}
s = a+" "+s;
n = n/2;
}
}
void count()
{
    calculate();
    if( count1 %2 ==0)
    System.out.println("\n EVIL NUMBER");
    else
    System.out.println("\nNOT AN EVIL NUMBER");
    
}
public static void main(String args[])
{
    Evil bin=new Evil();
    bin.count();
}
}