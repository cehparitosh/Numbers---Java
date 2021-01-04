import java.util.*;
class Automorphic
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : "); // Inputting the number
    int n = sc.nextInt();
    int sq = n*n; // Finding the square
 
    String num = Integer.toString(n); // Converting the number to String
    String square = Integer.toString(sq); // Converting the square to String
 
    if(square.endsWith(num)) // If the square ends with the number then it is Automorphic
        System.out.print(n+" is an Automorphic Number.");
    else
        System.out.print(n+" is not an Automorphic Number.");
    }
}