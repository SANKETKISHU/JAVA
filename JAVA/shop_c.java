import java.util.*;
class Commission{
    private float salesAmount, rate;

    public Commission(){}

    public Commission(float s, float r){
        this.salesAmount = s;
        this.rate = r;
    }

    public float getSalesAmount() {
        return this.salesAmount;
    }

    public float getRates() {
        return this.rate;
    }

    public void setSalesAmount(float s) {
        if(s > 0) {
            this.salesAmount = s;
        } else {
            System.out.println("Invalid");
        }
    }

    public void setRates(float r) {
        if(r > 0) {
            this.rate = r;
        } else {
            System.out.println("Invalid");
        }
    }

    public double Res() {
        double res = (salesAmount/100)*rate;
        return res;
    }
}

public class shop_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Commission c = new Commission();
        System.out.print("Enter your Sales Amount: ");
        c.setSalesAmount(input.nextFloat());

        System.out.print("Enter your Rate: ");
        c.setRates(input.nextFloat());

        System.out.println("Your Commission Amount: " + c.Res());
        input.close();
    }
}
