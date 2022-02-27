import java.util.Scanner;
public class vowel_@
{
    public static String ReplaceVowel(String str) 
    {
        String res = "";

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') 
            {
                res += "@";
            } 
            else 
            {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Replace Vowel:\n" + ReplaceVowel(str));
        System.out.println("----------------------------------");

        input.close();
    }
}