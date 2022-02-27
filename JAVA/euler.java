import java.util.Scanner;
public class euler 
{
 public static void main(String args[]) 
 {
  int counter = 1;
  double mult = 1;
  double div = 0;
  double sumDiv = 0;
  double e;
  Scanner input = new Scanner(System.in);
  System.out.print("How many numbers you want to compute e: ");
  int size = input.nextInt();
  while (counter <= size) 
  {
   mult = (mult * counter);
   div = 1 / mult;
   sumDiv = sumDiv + div;
   e = 1 + sumDiv;
   System.out.println(e);
   System.out.println("\n");
   counter++;
  }
 }
}