import java.io.*;
public class negative_positive 
{
 public static void main(String args[])throws IOException
 {
  int num;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER ANY NUMBER");
  num=Integer.parseInt(br.readLine());
  if(num<0)
  {   
   System.out.println(" NUMBER IS NEGATIVE = "+num);
  }
  else if(num>0)
  {
   System.out.println(" NUMBER IS POSITIVE = "+num);
  }
  else
  {
   System.out.println(" NUMBER IS ZERO = "+num);
  }
 }
}