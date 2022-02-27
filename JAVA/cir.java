import java.util.Scanner;
class circle
{
  static int count;
  double radious;
  double area;
  
  circle(double radious)
  {
    count++;
    this.radious=radious;
  }
  void calculate()
  {
    area=3.14*Math.pow(radious,2);
  }
  void display()
  {
    System.out.println("RADIOUS OF A CIRCLE = "+radious);
    System.out.println("NUMBER INSTANCES CREATED FOR CLASS ="+count);
  }
}
class cir
{
  public static void main(String args[])
  {
    int r;
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE RADIOUS =");
    r=sc.nextInt();
    System.out.println();
    circle cr=new circle(r);
    cr.calculate();
    cr.display();
  }
}