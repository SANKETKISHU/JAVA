import java.util.*;
class TransposeMatrix {
    private int row = 3, col = 4;
    private int TransposeMatrix[][] = new int[10][10];
    private int Matrix[][] = new int[10][10];
    private Scanner input = new Scanner(System.in);

    private void getInput() {
        System.out.println("\nEnter matrix: ");
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                Matrix[i][j] = input.nextInt();
            }
        }
    }

    private void printMatrix() {
        System.out.println("\nPrinting matrix: ");
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void transpose() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                TransposeMatrix[j][i] = Matrix[i][j];
            }
        }
    }

    private void printTranspose() {
        System.out.println("\nPrinting TransposeMatrix: ");
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(TransposeMatrix[i][j] + " ");
                if(j == row-1){
                    System.out.println();
                }
            }
        }
    }

    public void Res() {
        getInput();
        transpose();
        printMatrix();
        printTranspose();
    }
}

public class transpose_matrix {
    public static void main(String[] args) {
        TransposeMatrix sort = new TransposeMatrix();
        sort.Res();
    }
}
