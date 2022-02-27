import java.util.Scanner;
public class count_wrd 
{
    
    public static int countWords(String str) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' ') 
            {
                count++;
            }
        }
        return count + 1;
    }
    public static int countChar(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Number of words in the string: " + countWords(str));
        System.out.println("Number of characters in the string: " + countChar(str));

        input.close();
    }
}
