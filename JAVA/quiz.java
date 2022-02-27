import java.util.Scanner;
class WrongAnswerException extends Exception 
{
    public WrongAnswerException(String message) 
    {
        super(message);
    }
}

public class quiz 
{
    public static void QuizManagement() 
    {
        Scanner input = new Scanner(System.in);
        int score = 0;

        try 
        {
            System.out.println(
                    "Question 1: Which one of the following river flows between Vindhyan and Satpura ranges? \nA, Narmada \nB, Mahanadi \nC, Son \nD, Netravati");
            System.out.print("Enter your answer: ");
            String answer1 = input.nextLine();

            if (answer1.equalsIgnoreCase("A")) 
            {
                System.out.println("good! The answers are correct");
                score++;
            } 
            else 
            {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
            }
            System.out.println(
                    "Question 2: The country that has the highest in Barley Production? \nA, China \nB, Russia \nC, India \nD, France");
            System.out.print("Enter your answer: ");
            String answer2 = input.nextLine();

            if (answer2.equalsIgnoreCase("B")) 
            {
                System.out.println("good! The answers are correct");
                score++;
            } 
            else 
            {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
            }
            System.out.println(
                    "Question 3: Indus river originates in? \nA, Kinnaur \nB, Ladakh \nC, Tibet \nD, Nepal");
            System.out.print("Enter your answer: ");
            String answer3 = input.nextLine();

            if (answer3.equalsIgnoreCase("C")) 
            {
                System.out.println("good! The answers are correct");
                score++;
            }
             else 
             {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
             }
            

            System.out.println("Your score is " + score);
        } 
        catch (WrongAnswerException e) 
        {
            System.out.println(e.getMessage());
        }
        input.close();
    }

    public static void main(String[] args) 
    {
        QuizManagement();
    }
}
