import java.util.Scanner;
class money
{
 int paisa=0;
 int rupee=0;
 int totalmoney=0;
 
 void input(int p,int r)
 {
  paisa=p;
  rupee=r;
 }
 void constructor()
 {
  if(paisa>99)
  {
   rupee++;
  }
  else
  {
   totalmoney=rupee+paisa;
  }
 }
 void display()
 {
  System.out.println("TOTAL MONEY = "+totalmoney);
 }
}
class testmoney
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  money m=new money();
  System.out.print("ENTER PAISA = ");
  int p1=sc.nextInt();
  System.out.print("ENTER RUPEE = ");
  int r1=sc.nextInt();
  m.input(p1,r1);
  m.constructor();
  m.display();
 }
}
 