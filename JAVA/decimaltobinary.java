import java.util.Scanner;
public class decimaltobinary
{
 
    public static void main(String args[]) 
    {
        int a;
        int i = 0;
        int b[] = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Decimal value: ");
        a=sc.nextInt();
 
        while (a != 0)
        {
            i++;
            b[i] = a % 2;
            a = a / 2;
        }
        System.out.println("the binary value for the given decimal is: ");
        for (int j = i; j > 0; j--)
        {
 
            System.out.print(b[j]);
        }
    }
}