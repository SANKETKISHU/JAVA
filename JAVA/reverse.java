import java.util.Scanner;
public class reverse   
{  
 public static void main(String[] args)   
 {  
  int num, reverse = 0;  
  Scanner sc = new Scanner(System.in);
  System.out.println(" ENTER THE NUMBER  ");
  num=sc.nextInt();
  while(num!=0)   
  {  
   int remainder = num % 10;  
   reverse = reverse * 10 + remainder;  
   num = num/10;  
  }  
  System.out.println("The reverse of the given number is: " + reverse);  
 }  
}  