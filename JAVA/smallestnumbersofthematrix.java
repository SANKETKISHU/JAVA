import java.util.*;
class MatrixMaxMin {
    private int size = 4;
    private Integer Array[][] = new Integer[size][size];
    private Scanner input = new Scanner(System.in);

    private void getInput() {
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                Array[i][j] = input.nextInt();
            }
        }
    }

    private void MinMax() {
        int min = Array[0][0], max = Array[0][0];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(min > Array[i][j]){
                    min = Array[i][j];
                }
                if(max < Array[i][j]){
                    max = Array[i][j];
                }
            }
        }
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }

    public void Res() {
        System.out.println("Enter the 4X4 Element of Array: ");
        getInput();
        System.out.println("_______________________________");
        System.out.println("Size of Array: [" + size + "]" + "[" + size + "]");
        MinMax();
        System.out.println("_______________________________");
    }
}

public class smallestnumbersofthematrix{
    public static void main(String[] args) {
        MatrixMaxMin sort = new MatrixMaxMin();
        sort.Res();
    }
}
