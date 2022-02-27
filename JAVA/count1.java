import java.util.Scanner;
public class count1
{
 public static void main(String args[])
 {
   int count=0,num;
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER THE  NUMBER");
   num=sc.nextInt();
   while (num != 0) 
   {
     num = num/10;
      count++;
   }

    System.out.println("Number of digits: " + count);
  }
}