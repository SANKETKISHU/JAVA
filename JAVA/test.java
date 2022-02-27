import java.util.Scanner;
class swap
{
  int a,b;
  Scanner sc=new Scanner(System.in);
  void getdata()
  {
    System.out.print("ENTER THE VALUE IN A =");
    a=sc.nextInt();
    System.out.println();
    System.out.print("ENTER THE VALUE IN B = ");
    b=sc.nextInt();
    System.out.println();
}
  void swap1()
  {
    int c;
    c=a;
    a=b;
    b=c;
  }
  void display1()
  {
     System.out.println("VALUE IN A  ="+a);
     System.out.println("VALUE IN B  ="+b);
  }
  void swap2(swap s)
  {
    int c;
    c=s.a;
    s.a=s.b;
    s.b=c;
  }
}

class test
{
  public static void main(String args[])
  {
    swap sp=new swap();
    sp.getdata();
    sp.swap1();
    System.out.println("CALL BY VALUE ");
    sp.display1();
    sp.swap2(sp);
    System.out.println("CALL BY REFRENCE");
    sp.display1();
  }
}