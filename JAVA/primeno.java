import java.util.Scanner;
class primeno
{
 public static void main(String arg[])	
 { 
  int i,count,j;
  System.out.print("Enter the range : "); 
  Scanner sc=new Scanner(System.in); 
  int n=sc.nextInt();
  System.out.println("Prime numbers between 1 to "+n+" are ");
  for(j=2;j<=n;j++)
  {
   count=0;
   for(i=1;i<=j;i++)
   {
    if(j%i==0)
    {
     count++;         
    }
   }
   if(count==2)
   {
    System.out.println(j+" PRIME NUMBER ");     
   }
  }
 }   
}