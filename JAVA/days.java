import java.io.*;
public class days 
{
  public static void main(String args[])throws IOException
  {
    int day;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER THE NUMBER OF DAYS");
    day=Integer.parseInt(br.readLine());
    switch (day) 
    {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}