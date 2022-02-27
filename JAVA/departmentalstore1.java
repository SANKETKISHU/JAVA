import java.util.*;
class DepartmentalStore {
    private int stores = 4, departments = 5, storeSales, departmentSale;
    private int DepartmentalS[][] = new int[stores][departments];
    private Scanner input = new Scanner(System.in);

    private void Calc() {
        for(int i = 0; i < stores; i++) {
            System.out.println("\n-----------------------------");
            System.out.println("Store Number: " + (i+1));
            for(int j = 0; j < departments; j++) {
                System.out.print("Department Number["+ (j+1) +"]: ");
                DepartmentalS[i][j] = input.nextInt();
            }
        }
    }

    public void Res() {
        Calc();
        System.out.println("\n-----------------------------");
        System.out.println("Sales Report Monthly: ");

        for(int i = 0; i < stores; i++) {
            storeSales = 0;
            for(int j = 0; j < departments; j++) {
                storeSales += DepartmentalS[i][j];
            }
            System.out.println("Store Number[" + (i+1) +"]: ");
            System.out.println("Sales Report: " + storeSales);
        }

        System.out.println("\n-----------------------------");
        System.out.println("Sales Report Department: ");

        for (int i = 0; i < departments; i++) {
            departmentSale = 0;
            for (int j = 0; j < stores; j++) {
                departmentSale += DepartmentalS[j][i];
            }
            System.out.println("Department Number [" + (i + 1)
                + "] Sales: " + departmentSale);
        }
    }
}

public class departmentalstore1 {
    public static void main(String[] args) {
        

        DepartmentalStore DS = new DepartmentalStore();
        DS.Res();
    }
}
