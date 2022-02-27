import java.util.Scanner;
class MultiLineThread extends Thread
{
    String line;
    MultiLineThread(String line)
    {
        this.line = line;
    }
    public void run()
    {
        String[] words = line.split(" ");
        for(String word: words){
            System.out.println(word);
        }
    }
}

public class multithreading
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line1 = input.nextLine();
        System.out.println("Enter another line of text:");
        String line2 = input.nextLine();

        MultiLineThread t1 = new MultiLineThread(line1);
        MultiLineThread t2 = new MultiLineThread(line2);
        t1.start();
        t2.start();

        input.close();
    }
}