import java.io.*;
public class evenodd 
{
 public static void main(String args[])throws IOException
 {
  int num;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER ANY NUMBER");
  num=Integer.parseInt(br.readLine());
  if(num % 2 == 0)
  {
   System.out.println(num + " is even");
  }
  else
  {
   System.out.println(num + " is odd");
  }
 }
}