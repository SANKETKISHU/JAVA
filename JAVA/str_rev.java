import java.util.Scanner;
interface StringReversal 
{
    String reversal(String str);
}

class StringReversalImpl implements StringReversal 
{
    public String reversal(String str) 
    {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

public class str_rev
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringReversalImpl stringReversalImpl = new StringReversalImpl();
        String reverse = stringReversalImpl.reversal(str);
        System.out.println("Reversed string: " + reverse);
        scanner.close();
    }
}