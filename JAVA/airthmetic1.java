import java.io.*;
public class airthmetic1
{
 public static void main(String args[])throws IOException
 {
  int x,y,ch,n=1,a,s,m,d,md;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER THE FIRST NUMBER = ");
  x=Integer.parseInt(br.readLine());
  System.out.println("ENTER THE SECOND NUMBER = ");
  y=Integer.parseInt(br.readLine());
  while(n==1)
  {
   System.out.println("1:- ADDITION");
   System.out.println("2:- SUBTRACTION");
   System.out.println("3:- MULTIPLICATION");
   System.out.println("4:- DIVISION");
   System.out.println("5:- MODULATION");
   System.out.println("6:- EXIT");
   System.out.println("ENTER YOUR CHOICE");
   ch=Integer.parseInt(br.readLine());
  
  switch(ch)
  {
   case 1:
   a=x+y;
   System.out.println("ADDITION = "+a);
   break;
   case 2:
   s=x-y;
   System.out.println("SUBTRACTION = "+s);
   break;
   case 3:
   m=x*y;
   System.out.println("MULTIPLICATION = "+m);
   break;
   case 4:
   d=x/y;
   System.out.println("DIVISION = "+d);
   break;
   case 5:
   md=x%y;
   System.out.println("MODULATION = "+md);
   break;
   case 6:
   System.exit(0);
   default:
   System.out.println("WRONG CHOICE");
   break;
  }
  }
  }
}

   

   
   
   
  
  
  
