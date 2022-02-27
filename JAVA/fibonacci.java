import java.util.Scanner;
public class fibonacci
{
 public static void main(String args[])
 {
   int a=0,b=1,c=0,n;
   Scanner sc=new Scanner(System.in); 
   System.out.println(" ENTER THE Nth TERM ");
   n=sc.nextInt();
   System.out.println(" FIBONACCI SERIES "); 
   while(c<=n)
   {
     System.out.println(c);
     a=b;
     b=c;
     c=a+b;
    }
 }
}