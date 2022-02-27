import java.util.Scanner;
class Money 
{
 int Rupee, Paisa;
 Money(int r, int p)
 {
  Rupee = r + p / 100;
  Paisa = p % 100;
 }
 void add(int r,int p)
 {
  Paisa = Paisa + p;
  int Temp = Paisa / 100;
  Paisa = Paisa % 100;
  Rupee = Rupee + Temp + r;
 }
 void sub(int r,int p)
 {
  int Temp = p / 100;
  p = p % 100;
  if (p > Paisa) 
  {
   Paisa = Paisa + 100;
   Rupee = Rupee - 1;
   Paisa = Paisa - p;
  } 
  else 
  {
   Paisa = Paisa - p;
  }
  Rupee = Rupee - r - Temp;
 }
 void display()
 {
  System.out.println("Money: " +Rupee+ "." +Paisa);
 }
}
class money_m
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("ENTER THE RUPEE = ");
  int r1=sc.nextInt();
  System.out.println();
  System.out.print("ENTER THE PAISA = ");
  int p1=sc.nextInt();
  Money mm=new Money(r1,p1);
  mm.display();
  System.out.println("ENTER ADDITION VALUES FOR MONEY= ");
  System.out.print("ENTER THE RUPEE = ");
  int r2=sc.nextInt();
  System.out.println();
  System.out.print("ENTER THE PAISA = ");
  int p2=sc.nextInt();
  mm.add(r2,p2);
  mm.display();
  System.out.println("ENTER SUBTRACTION VALUES FOR MONEY= ");
  System.out.print("ENTER THE RUPEE = ");
  int r3=sc.nextInt();
  System.out.println();
  System.out.print("ENTER THE PAISA = ");
  int p3=sc.nextInt();
  mm.sub(r3,p3);
  mm.display();
 }
}
  