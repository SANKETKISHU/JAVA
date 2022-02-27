import java.util.Scanner;

public class lcmhcf
{
    public static void main(String args[])
    {
        int a, b, x, y, t, hcf, lcm;
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Enter first Number : ");
        x = scan.nextInt();
        System.out.println("Enter second Number : ");
        y = scan.nextInt();
      
        a = x;
        b = y;
      
        while(b != 0)
        {
            t = b;
            b = a%b;
            a = t;
        }
      
        hcf = a;
        lcm = (x*y)/hcf;
      
        System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
    }
}