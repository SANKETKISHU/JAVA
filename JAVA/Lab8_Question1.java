import java.util.Scanner;
/**
 * Design an interface with a method reversal( ). This method takes a string as its input and returns the reversed string. Create a class StringReversal and implement the method (do not use predefined methods).
 */

interface StringReversal {
    String reversal(String str);
}

class StringReversalImpl implements StringReversal {
    @Override
    public String reversal(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

public class Lab8_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        // Take user input
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // Create object of StringReversalImpl class
        StringReversalImpl stringReversalImpl = new StringReversalImpl();

        // Call the method
        String reverse = stringReversalImpl.reversal(str);

        // Print the result
        System.out.println("Reversed string: " + reverse);

        scanner.close();
    }
}