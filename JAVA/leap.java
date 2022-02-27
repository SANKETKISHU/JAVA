import java.util.Scanner;
public class leap
{
 public static void main(String[] args) 
 {
  int year;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number: ");
  year = sc.nextInt();
  if(year%4==0)
  {
   System.out.println("LEAP YEAR = "+year);
  }
  else
  {
   System.out.println("NOT A LEAP YEAR ="+year);
  }
 }
} 