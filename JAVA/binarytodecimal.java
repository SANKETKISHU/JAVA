import java.util.Scanner;
class binarytodecimal
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter a binary number:");
            int n=sc.nextInt();
            
            int decimal=0,p=0;
            
            while(n!=0)
            {
                decimal+=((n%10)*Math.pow(2,p));
                n=n/10;
                p++;
            }
            
            System.out.println("DECIMAL NUMBER = "+decimal);
        }
}