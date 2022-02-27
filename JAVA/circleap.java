import java.util.Scanner;
public class circleap 
{
 public static void main(String[] args) 
 {
  double radius, area, perimeter;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter Radius of Circle:");
  radius = in.nextDouble();
  area = 3.14 * radius * radius;
  perimeter = 2 * 3.14 * radius;
  System.out.println("AREA OF CIRCLE : " + area);
  System.out.println("PERIMETER OF CIRCLE : " + perimeter);
 }
 
}