import java.util.Scanner;
public class str_unique 
{
    public static boolean uniqueChar(String str) 
    {
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = i + 1; j < str.length(); j++) 
            {
                if (str.charAt(i) == str.charAt(j)) 
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        if (uniqueChar(str)) 
        {
            System.out.println("String is unique");
        } 
        else 
        {
            System.out.println("String is not unique");
        }

        input.close();
    }
}