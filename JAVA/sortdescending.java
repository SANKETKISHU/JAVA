import java.util.*;
class ArraySort {
    private int size = 6,i,j,temp;
    private Integer Array[] = new Integer[size];
    private Scanner input = new Scanner(System.in);

    private void getInput() {
        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
    }

    public void Res() {
        System.out.println("Enter the 6 Element of Array: ");
        getInput();
        System.out.println("Size of Array: " + size);
        for (i = 0; i < ( size - 1 ); i++) {
         for (j = 0; j < size - i - 1; j++) {
        if (Array[j] < Array[j+1]) 
        {
          temp = Array[j];
          Array[j] = Array[j+1];
          Array[j+1] = temp;
        }
      }
    }
    System.out.println("descending Order:");
 
    for (i = 0; i < size; i++) 
      System.out.println(Array[i]);
  }
}

public class sortdescending {
    public static void main(String[] args) {
        ArraySort sort = new ArraySort();
        sort.Res();
    }
}
