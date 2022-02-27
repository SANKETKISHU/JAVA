import java.util.*;
class ArrayCalc{
    private int size=15, sum = 0;
    private int Array[] = new int[size];
    private Scanner input = new Scanner(System.in);

    public ArrayCalc(){}

    public void getInput() {
        for(int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
        ArraySum();
    }

    private void ArraySum() {
        for(int i = 0; i < size; i++) {
            this.sum += Array[i];
        }
    }

    private void Divisible() {
        System.out.println("Numbers Divisible by 3 & 5: ");
        for(int i = 0; i < size; i++) {
            if(Array[i] % 3 == 0 && Array[i] % 5 == 0) {
                System.out.println(Array[i] + " ");
            }
        }
    }

    public void Res() {
        System.out.println("Size of Array: " + size);
        System.out.println("Sum of Arrays: " + sum);
        Divisible();
    }
}

public class divisible35 {
    public static void main(String[] args) {
        System.out.println("Enter 15 element of array: ");
        ArrayCalc arr = new ArrayCalc();

        arr.getInput();
        arr.Res();
    }
}
