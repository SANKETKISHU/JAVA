import java.util.Scanner;
class PasswordException extends Exception 
{
    public PasswordException(String msg) 
    {
        super(msg);
    }
}

public class user_pwd 
{
    public static void checkPassword(String username, String password) throws PasswordException 
    {
        if (username.length() < 6) 
        {
            throw new PasswordException("Username is less than 6 characters");
        } 
        else if (username.equals(password)) 
        {
            throw new PasswordException("Password should not match with Username");
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while (true) 
        {
            try 
            {
                System.out.println("##############################");
                System.out.println("Enter Username: ");
                String username = input.nextLine();
                System.out.println("Enter Password: ");
                String password = input.nextLine();
                System.out.println("##############################");
                checkPassword(username, password);
                System.out.println("Username and Password are correct");
                break;
            } 
            catch (PasswordException e) 
            {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }
}
