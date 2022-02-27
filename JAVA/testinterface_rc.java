interface FindArea
{    
   double pi = 3.14159265359;    
   double calculate(double a, double b);    
}
class Rectangle implements FindArea    
{    
   public double calculatea(double a, double b)    
   {    
      return(a * b);    
   }
   public double calculatep(double l, double b)    
   {    
      return 2*(l * b);    
   }
}
class Circle implements FindArea    
{    
   public double calculatea(double a, double b)    
   {    
      return(pi * a * a);    
   }    
}
public class testinterface_rc
{
   public static void main(String[] args) 
   {
      Rectangle rect = new Rectangle();    
      Circle cir = new Circle();    
      FindArea area;
      area = rect;    
      System.out.println("Area of rectangle is: " + area.calculatea(50, 30)); 
      System.out.println("Perimeter of rectangle is: " + area.calculateb(50, 30));      
      area = cir;    
      System.out.println("Area of circle is: " + area.calculatea(10, 10));
   }
}
