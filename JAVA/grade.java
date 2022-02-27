import java.io.*;
public class grade
{
 public static void main(String args[])throws IOException
 {
  int marks;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER THE MARKS");
  marks=Integer.parseInt(br.readLine());
  if(marks>=90)
  {
   System.out.println("GRADE = A");
  }
  else if(marks>=80 && marks<=89)
  {
   System.out.println("GRADE = B");
  }
  else if(marks>=70 && marks<=79)
  {
   System.out.println("GRADE = C");
  }
  else if(marks>=60 && marks<=69)
  {
   System.out.println("GRADE = D");
  }
  else if(marks>=50 && marks<=59)
  {
   System.out.println("GRADE = E");
  }
  else
  {
   System.out.println("GRADE = F");
  }
 }
}