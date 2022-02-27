import java.util.Scanner;

public class TestFile 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Rectangle rect = new Rectangle(10, 20);

        System.out.println("Length : " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());

        System.out.println("-------------------------");
        System.out.print("Enter Radius: ");
        double R = input.nextDouble();
        Circle c1 = new Circle(R);
        System.out.println("Circle Radius: " + c1.getRadius() + " Area: " + c1.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        input.close();
    }
}

