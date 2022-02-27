import java.util.Scanner;
interface Stack 
{
    void push(int element);

    int pop();
}

class StackImpl implements Stack 
{
    int[] array;
    int top;

    public StackImpl(int size) 
    {
        array = new int[size];
        top = -1;
    }
    public void push(int element) 
    {
        if (top == array.length - 1) 
        {
            int[] temp = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) 
            {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[++top] = element;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top--];
    }

    public void displayStack() 
    {
        for (int i = top; i >= 0; i--) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class stacktest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        StackImpl stack = new StackImpl(size);
        int choice = 0;

        while(choice!=4) 
        {
            System.out.println("----------------------------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("----------------------------------");
                System.out.println("Enter the element to be pushed");
                int element = sc.nextInt();
                stack.push(element);
                break;
            case 2:
                int poppedElement = stack.pop();
                if (poppedElement != -1) 
                {
                    System.out.println("----------------------------------");
                    System.out.println("Popped element is " + poppedElement);
                }
                break;
            case 3:
                System.out.println("----------------------------------");
                stack.displayStack();
                break;
            case 4:
                System.out.println("----------------------------------");
                System.out.println("Exiting");
                break;
            default:
                System.out.println("----------------------------------");
                System.out.println("Invalid choice");
                break;
            }
        }
        sc.close();
    }
}
