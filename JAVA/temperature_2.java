import java.util.Scanner;
class TooHotException extends Exception 
{
    public TooHotException(String msg) 
    {
        super(msg);
    }
}

class TooColdException extends Exception 
{
    public TooColdException(String msg) 
    {
        super(msg);
    }
}

public class temperature_2
{
    public static void checkTemperature(double temperature) throws TooHotException, TooColdException 
    {
        if (temperature > 40) 
        {
            throw new TooHotException("Too hot");
        } else if (temperature < 8) {
            throw new TooColdException("Too cold");
        } 
        else 
        {
            System.out.print("Normal temperature: ");
            System.out.print(temperature * 9 / 5 + 32);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        
        try 
        {
            checkTemperature(temperature);
        } 
        catch (TooHotException e) 
        {
            System.out.println(e.getMessage());
        } catch (TooColdException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
