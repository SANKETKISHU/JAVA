import java.util.Scanner;
class moter_vechicle
{
  String modelName;
  int modelNumber;
  int modelPrice;
  int finalprice;
  int discount;
  
 moter_vechicle(String n,int mn,int p)
 {
   modelName=n;
   modelNumber=mn;
   modelPrice=p;
 }
 void display()
 {
   System.out.println("MODLE NAME     = "+modelName);
   System.out.println("MODLE NUMBER = "+modelNumber);
   System.out.println("MODLE PRICE     = " +modelName);
 }
}
class car extends moter_vechicle
{
  car(String n,int mn,int p)
  {
   super(n,mn,p);
  }
  void discount()
  {
    if(modelPrice>=100000)
    {
      discount=modelPrice*25/100;
      finalprice=modelPrice-discount;
    }
    else if(modelPrice<100000 && modelPrice>=75000)
    {
      discount=modelPrice*15/100;
      finalprice=modelPrice-discount;
    }
    else if(modelPrice<75000 && modelPrice>=50000)
    {
      discount=modelPrice*10/100;
      finalprice=modelPrice-discount;
    }
    else
    {
      discount=0;
    } 
}
  void display()
  {
    System.out.println("MODEL NAME     = "+modelName);
    System.out.println("MODLE NUMBER = "+modelNumber);
    System.out.println("MODLE PRICE     = "+modelPrice);
    System.out.println("DISCOUNT         = "+discount);
    System.out.println("FINAL PRICE      = "+finalprice);
  }
}
  class moter_v_m
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("ENTER MODEL NAME     = ");
      String mn1=sc.nextLine();
      System.out.println();
      System.out.print("ENTER MODLE NUMBER = ");
      int mn2=sc.nextInt(); 
      System.out.println(); 
      System.out.print("ENTER MODLE PRICE     = ");
      int p=sc.nextInt();
      System.out.println();
      car mm=new car(mn1,mn2,p);
      mm.discount(); 
      mm.display();
    }
}
    