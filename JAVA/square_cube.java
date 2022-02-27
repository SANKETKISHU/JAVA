import java.io.*;
public class square_cube 
{
 public static void main(String args[])throws IOException
 {
  int num,sq,cu;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER ANY NUMBER");
  num=Integer.parseInt(br.readLine());
  sq=num*num;
  cu=num*num*num;
  System.out.println("SQUARE = "+sq);
  System.out.println("CUBE = "+cu);
 }
}