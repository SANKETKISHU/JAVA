import java.util.Scanner;
public class prime1 
{
 public static void main(String[] args) 
 {
  int n,i,p=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE NUMBER:");
  n = sc.nextInt();
  for(i=1;i<=n;i++)
  {
   if(n%i==0)
   {
    p++;
   }
  }
  if(p==2)
  {
   System.out.println(" PRIME NUMBER = "+n);
  }
  else
  {
   System.out.println(" NOT PRIME NUMBER = "+n);
  }
 }
}