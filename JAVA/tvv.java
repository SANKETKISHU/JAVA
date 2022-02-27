import java.util.Scanner;
class television
{
 float cost;
 float discount;
 float amount;

void accept(int c)
{
 cost=c;
}
void calculate()
{
 if (cost>60000)
 {
  discount=cost*23/100;
  amount=cost-discount;
 }
 else if(cost<60000 && cost>=30000)
 {
  discount=cost*15/100;
  amount=cost-discount;
 }
 else if(cost<30000 && cost>=15000)
 {
  discount=cost*15/100;
  amount=cost-discount;
 }
 else
 {
  discount=0;
  amount=cost-discount;
 }
}
void display()
{
 System.out.println("*COST OF TELIVISION = "+cost);
 System.out.println("*DISCOUNT           = "+discount);
 System.out.println("*TOTAL AMOUNT       = "+amount);
}
}
class tvv
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  television tv=new television();
  System.out.print("*ENTER THE COST OF TELIVISION = ");
  int t=sc.nextInt();
  tv.accept(t);
  tv.calculate();
  tv.display();
 }
}